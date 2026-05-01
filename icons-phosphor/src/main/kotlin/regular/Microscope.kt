package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorRegularIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 208.0f),
                    PathNode.LineTo(203.94f, 208.0f),
                    PathNode.CurveTo(224.66403f, 182.816f, 229.76962f, 148.23941f, 217.2087f, 118.14053f),
                    PathNode.CurveTo(204.64775f, 88.04165f, 176.47815f, 67.351555f, 144.0f, 64.37f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(144.0f, 23.163445f, 136.83656f, 16.0f, 128.0f, 16.0f),
                    PathNode.LineTo(80.0f, 16.0f),
                    PathNode.CurveTo(71.163445f, 16.0f, 64.0f, 23.163445f, 64.0f, 32.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 144.83656f, 71.163445f, 152.0f, 80.0f, 152.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.CurveTo(136.83656f, 152.0f, 144.0f, 144.83656f, 144.0f, 136.0f),
                    PathNode.LineTo(144.0f, 80.46f),
                    PathNode.CurveTo(172.85992f, 83.694664f, 196.95132f, 103.95057f, 205.09294f, 131.82658f),
                    PathNode.CurveTo(213.23456f, 159.7026f, 203.83232f, 189.74084f, 181.25f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 211.58173f, 24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 220.41827f, 27.581722f, 224.0f, 32.0f, 224.0f),
                    PathNode.LineTo(224.0f, 224.0f),
                    PathNode.CurveTo(228.41827f, 224.0f, 232.0f, 220.41827f, 232.0f, 216.0f),
                    PathNode.CurveTo(232.0f, 211.58173f, 228.41827f, 208.0f, 224.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 184.0f),
                    PathNode.CurveTo(67.58172f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 171.58173f, 67.58172f, 168.0f, 72.0f, 168.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(140.41827f, 168.0f, 144.0f, 171.58173f, 144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 180.41827f, 140.41827f, 184.0f, 136.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
