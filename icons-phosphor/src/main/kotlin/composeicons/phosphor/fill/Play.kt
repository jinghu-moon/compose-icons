package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorFillIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128c.013 5.525-2.871 10.653-7.6 13.51L88.32 229.65c-4.946 3.029-11.145 3.144-16.2 .3C67.113 227.151 64.008 221.866 64 216.13v-176.26c.008-5.736 3.113-11.021 8.12-13.82 5.055-2.844 11.254-2.729 16.2 .3l144.08 88.14c4.729 2.857 7.613 7.985 7.6 13.51Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
