package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicOffFill: ImageVector
    get() {
        if (_micOffFill != null) return _micOffFill!!
        _micOffFill = remixIcon(
            name = "MicOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.425 17.839c-1.032 .584-2.191 .97-3.425 1.106v4.055h-2v-4.055C6.829 18.484 3.516 15.172 3.055 11h2.016c.485 3.392 3.403 6 6.929 6 1.05 0 2.046-.231 2.94-.646L13.39 14.804c-.441 .127-.908 .196-1.39 .196C9.239 15 7 12.761 7 10v-1.586L1.394 2.808 2.808 1.393 22.607 21.192l-1.414 1.414L16.425 17.839ZM19.375 15.16 17.932 13.718c.508-.81 .856-1.731 .997-2.718h2.016c-.17 1.537-.726 2.957-1.57 4.16ZM16.466 12.251 7.686 3.471C8.554 1.993 10.161 1 12 1c2.761 0 5 2.239 5 5v4c0 .81-.193 1.575-.534 2.251Z"),
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
        return _micOffFill!!
    }

private var _micOffFill: ImageVector? = null
