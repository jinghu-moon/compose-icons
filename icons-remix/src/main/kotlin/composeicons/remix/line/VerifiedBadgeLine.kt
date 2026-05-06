package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VerifiedBadgeLine: ImageVector
    get() {
        if (_verifiedBadgeLine != null) return _verifiedBadgeLine!!
        _verifiedBadgeLine = remixIcon(
            name = "VerifiedBadgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.007 2.104C8.606 1.65 7.082 2.281 6.412 3.593L5.606 5.17c-.096 .187-.248 .34-.436 .436L3.593 6.411C2.281 7.082 1.65 8.605 2.104 10.007l.545 1.685c.065 .2 .065 .416 0 .616l-.545 1.685c-.454 1.402 .177 2.925 1.489 3.595l1.577 .806c.187 .096 .34 .248 .436 .436l.806 1.577c.67 1.312 2.194 1.943 3.596 1.489l1.685-.545c.2-.065 .416-.065 .616 0l1.685 .545c1.402 .454 2.925-.177 3.595-1.489l.806-1.577c.096-.187 .248-.34 .436-.436l1.577-.806c1.312-.67 1.943-2.194 1.489-3.595l-.545-1.685c-.065-.2-.065-.416 0-.616l.545-1.685C22.35 8.605 21.719 7.082 20.407 6.411L18.83 5.606c-.187-.096-.34-.248-.436-.436L17.589 3.593C16.918 2.281 15.395 1.65 13.993 2.104l-1.685 .545c-.2 .065-.416 .065-.616 0L10.007 2.104ZM8.193 4.503c.223-.437 .731-.648 1.198-.496l1.685 .545c.601 .194 1.247 .194 1.848 0l1.685-.545c.467-.151 .975 .059 1.198 .496l.806 1.577c.287 .562 .744 1.019 1.307 1.307l1.577 .806c.437 .223 .648 .731 .496 1.198l-.546 1.685c-.194 .601-.194 1.247 0 1.848l.546 1.685c.151 .467-.059 .975-.496 1.198l-1.577 .806c-.562 .287-1.019 .744-1.307 1.307l-.806 1.577c-.224 .437-.731 .648-1.198 .496l-1.685-.545c-.601-.194-1.247-.194-1.848 0l-1.685 .545c-.467 .151-.975-.059-1.198-.496L7.387 17.92C7.1 17.358 6.642 16.9 6.08 16.613L4.503 15.807c-.437-.223-.648-.731-.496-1.198l.545-1.685c.194-.601 .194-1.247 0-1.848L4.007 9.391c-.151-.467 .059-.975 .496-1.198L6.08 7.387C6.642 7.099 7.1 6.642 7.387 6.08L8.193 4.503ZM6.76 11.757l4.243 4.243L18.073 8.929 16.659 7.515l-5.657 5.657L8.174 10.343 6.76 11.757Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _verifiedBadgeLine!!
    }

private var _verifiedBadgeLine: ImageVector? = null
