package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorFillIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.28f, 155.72f),
                    PathNode.CurveTo(222.67827f, 165.76299f, 226.84851f, 180.63512f, 223.18788f, 194.6203f),
                    PathNode.CurveTo(219.52727f, 208.60547f, 208.60547f, 219.52727f, 194.6203f, 223.18788f),
                    PathNode.CurveTo(180.63512f, 226.84851f, 165.76299f, 222.67827f, 155.72f, 212.28f),
                    PathNode.LineTo(128.0f, 184.57f),
                    PathNode.LineTo(100.28f, 212.28f),
                    PathNode.CurveTo(90.23702f, 222.67827f, 75.36488f, 226.84851f, 61.379707f, 223.18788f),
                    PathNode.CurveTo(47.39453f, 219.52727f, 36.472733f, 208.60547f, 32.812115f, 194.6203f),
                    PathNode.CurveTo(29.151497f, 180.63512f, 33.321735f, 165.76299f, 43.72f, 155.72f),
                    PathNode.LineTo(71.43f, 128.0f),
                    PathNode.LineTo(43.72f, 100.28f),
                    PathNode.CurveTo(33.321735f, 90.23702f, 29.151497f, 75.36488f, 32.812115f, 61.379707f),
                    PathNode.CurveTo(36.472733f, 47.39453f, 47.39453f, 36.472733f, 61.379707f, 32.812115f),
                    PathNode.CurveTo(75.36488f, 29.151497f, 90.23702f, 33.321735f, 100.28f, 43.72f),
                    PathNode.LineTo(128.0f, 71.43f),
                    PathNode.LineTo(155.72f, 43.72f),
                    PathNode.CurveTo(165.76299f, 33.321735f, 180.63512f, 29.151497f, 194.6203f, 32.812115f),
                    PathNode.CurveTo(208.60547f, 36.472733f, 219.52727f, 47.39453f, 223.18788f, 61.379707f),
                    PathNode.CurveTo(226.84851f, 75.36488f, 222.67827f, 90.23702f, 212.28f, 100.28f),
                    PathNode.LineTo(184.57f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.69f, 173.25f),
                    PathNode.LineTo(82.75f, 139.31f),
                    PathNode.LineTo(55.0f, 167.0f),
                    PathNode.CurveTo(45.61116f, 176.38882f, 45.61116f, 191.61118f, 55.0f, 201.0f),
                    PathNode.CurveTo(64.38884f, 210.38882f, 79.61116f, 210.38882f, 89.0f, 201.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.94f, 128.0f),
                    PathNode.LineTo(128.0f, 94.06f),
                    PathNode.LineTo(94.06f, 128.0f),
                    PathNode.LineTo(128.0f, 161.94f),
                    PathNode.Close,
                    PathNode.MoveTo(200.94f, 89.0f),
                    PathNode.CurveTo(210.32884f, 79.62773f, 210.34227f, 64.41884f, 200.97f, 55.03f),
                    PathNode.CurveTo(191.59773f, 45.64116f, 176.38882f, 45.627728f, 167.0f, 55.0f),
                    PathNode.LineTo(139.31f, 82.75f),
                    PathNode.LineTo(173.25f, 116.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
