package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VerifiedBadgeFill: ImageVector
    get() {
        if (_verifiedBadgeFill != null) return _verifiedBadgeFill!!
        _verifiedBadgeFill = remixIcon(
            name = "VerifiedBadgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.007 2.104C8.605 1.65 7.082 2.281 6.412 3.593L5.606 5.17c-.096 .187-.248 .34-.436 .436L3.593 6.412C2.281 7.082 1.65 8.605 2.104 10.007l.545 1.685c.065 .2 .065 .416 0 .616l-.545 1.685c-.454 1.402 .177 2.925 1.489 3.595l1.577 .806c.187 .096 .34 .248 .436 .436l.806 1.577c.67 1.312 2.194 1.943 3.595 1.489l1.685-.545c.2-.065 .416-.065 .616 0l1.685 .545c1.402 .454 2.925-.177 3.595-1.489l.806-1.577c.096-.187 .248-.34 .436-.436l1.577-.806c1.312-.67 1.943-2.194 1.489-3.595l-.545-1.685c-.065-.2-.065-.416 0-.616l.545-1.685C22.35 8.605 21.719 7.082 20.407 6.412L18.83 5.606c-.187-.096-.34-.248-.436-.436L17.588 3.593C16.918 2.281 15.395 1.65 13.993 2.104l-1.685 .545c-.2 .065-.416 .065-.616 0L10.007 2.104ZM6.76 11.757 8.174 10.343l2.828 2.828L16.659 7.515l1.414 1.414-7.071 7.071L6.76 11.757Z"),
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
        return _verifiedBadgeFill!!
    }

private var _verifiedBadgeFill: ImageVector? = null
