package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorFillIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 216.0f),
                    PathNode.CurveTo(232.0f, 220.41827f, 228.41827f, 224.0f, 224.0f, 224.0f),
                    PathNode.LineTo(32.0f, 224.0f),
                    PathNode.CurveTo(27.581722f, 224.0f, 24.0f, 220.41827f, 24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 211.58173f, 27.581722f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(181.25f, 208.0f),
                    PathNode.CurveTo(203.83232f, 189.74084f, 213.23456f, 159.7026f, 205.09294f, 131.82658f),
                    PathNode.CurveTo(196.95132f, 103.95057f, 172.85992f, 83.694664f, 144.0f, 80.46f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(144.0f, 144.83656f, 136.83656f, 152.0f, 128.0f, 152.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.CurveTo(71.163445f, 152.0f, 64.0f, 144.83656f, 64.0f, 136.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(64.0f, 23.163445f, 71.163445f, 16.0f, 80.0f, 16.0f),
                    PathNode.LineTo(128.0f, 16.0f),
                    PathNode.CurveTo(136.83656f, 16.0f, 144.0f, 23.163445f, 144.0f, 32.0f),
                    PathNode.LineTo(144.0f, 64.37f),
                    PathNode.CurveTo(176.47815f, 67.351555f, 204.64775f, 88.04165f, 217.2087f, 118.14053f),
                    PathNode.CurveTo(229.76962f, 148.23941f, 224.66403f, 182.816f, 203.94f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(228.41827f, 208.0f, 232.0f, 211.58173f, 232.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 184.0f),
                    PathNode.CurveTo(140.41827f, 184.0f, 144.0f, 180.41827f, 144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 171.58173f, 140.41827f, 168.0f, 136.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(67.58172f, 168.0f, 64.0f, 171.58173f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 180.41827f, 67.58172f, 184.0f, 72.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
