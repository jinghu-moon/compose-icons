package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorRegularIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.87 114 63.87 18.11C58.068 14.844 50.849 15.512 45.745 19.789c-5.104 4.276-7.026 11.267-4.825 17.551L71.55 128 40.92 218.67c-1.73 4.896-.976 10.327 2.021 14.567 2.998 4.24 7.866 6.761 13.059 6.763 2.78-.006 5.511-.729 7.93-2.1L231.85 141.85c5.043-2.825 8.17-8.15 8.18-13.93 .01-5.78-3.098-11.117-8.13-13.96ZM56 224c.004-.04 .004-.08 0-.12L85.74 136h58.26c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-58.26L56.06 32.16C56.05 32.103 56.03 32.049 56 32l168 95.83Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
