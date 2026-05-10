package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileShield2Fill: ImageVector
    get() {
        if (_fileShield2Fill != null) return _fileShield2Fill!!
        _fileShield2Fill = remixIcon(
            name = "FileShield2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 10h-10v7.382c0 1.563 .778 3.023 2.074 3.892L14.157 22h-10.164C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.447 2 3.998 2h11.999L21 7v3ZM13 12h8v5.382c0 .896-.446 1.733-1.188 2.231L17 21.498 14.188 19.613C13.446 19.116 13 18.279 13 17.382v-5.382Z"),
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
        return _fileShield2Fill!!
    }

private var _fileShield2Fill: ImageVector? = null
