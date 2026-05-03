package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorRegularIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.57f, 128.0f),
                    PathNode.LineTo(212.28f, 100.28f),
                    PathNode.CurveTo(222.67827f, 90.23702f, 226.84851f, 75.36488f, 223.18788f, 61.379707f),
                    PathNode.CurveTo(219.52727f, 47.39453f, 208.60547f, 36.472733f, 194.6203f, 32.812115f),
                    PathNode.CurveTo(180.63512f, 29.151497f, 165.76299f, 33.321735f, 155.72f, 43.72f),
                    PathNode.LineTo(128.0f, 71.43f),
                    PathNode.LineTo(100.28f, 43.72f),
                    PathNode.CurveTo(90.23702f, 33.321735f, 75.36488f, 29.151497f, 61.379707f, 32.812115f),
                    PathNode.CurveTo(47.39453f, 36.472733f, 36.472733f, 47.39453f, 32.812115f, 61.379707f),
                    PathNode.CurveTo(29.151497f, 75.36488f, 33.321735f, 90.23702f, 43.72f, 100.28f),
                    PathNode.LineTo(71.43f, 128.0f),
                    PathNode.LineTo(43.72f, 155.72f),
                    PathNode.CurveTo(33.321735f, 165.76299f, 29.151497f, 180.63512f, 32.812115f, 194.6203f),
                    PathNode.CurveTo(36.472733f, 208.60547f, 47.39453f, 219.52727f, 61.379707f, 223.18788f),
                    PathNode.CurveTo(75.36488f, 226.84851f, 90.23702f, 222.67827f, 100.28f, 212.28f),
                    PathNode.LineTo(128.0f, 184.57f),
                    PathNode.LineTo(155.72f, 212.28f),
                    PathNode.CurveTo(165.76299f, 222.67827f, 180.63512f, 226.84851f, 194.6203f, 223.18788f),
                    PathNode.CurveTo(208.60547f, 219.52727f, 219.52727f, 208.60547f, 223.18788f, 194.6203f),
                    PathNode.CurveTo(226.84851f, 180.63512f, 222.67827f, 165.76299f, 212.28f, 155.72f),
                    PathNode.Close,
                    PathNode.MoveTo(167.0f, 55.0f),
                    PathNode.CurveTo(176.38882f, 45.61116f, 191.61118f, 45.61116f, 201.0f, 55.0f),
                    PathNode.CurveTo(210.38882f, 64.38884f, 210.38882f, 79.61116f, 201.0f, 89.0f),
                    PathNode.LineTo(173.28f, 116.72f),
                    PathNode.LineTo(139.31f, 82.75f),
                    PathNode.Close,
                    PathNode.MoveTo(161.91f, 128.0f),
                    PathNode.LineTo(128.0f, 161.94f),
                    PathNode.LineTo(94.06f, 128.0f),
                    PathNode.LineTo(128.0f, 94.06f),
                    PathNode.Close,
                    PathNode.MoveTo(55.0f, 89.0f),
                    PathNode.LineTo(55.0f, 89.0f),
                    PathNode.CurveTo(45.61116f, 79.61116f, 45.61116f, 64.38884f, 55.0f, 55.0f),
                    PathNode.CurveTo(64.38884f, 45.61116f, 79.61116f, 45.61116f, 89.0f, 55.0f),
                    PathNode.LineTo(116.72f, 82.72f),
                    PathNode.LineTo(82.75f, 116.69f),
                    PathNode.Close,
                    PathNode.MoveTo(89.0f, 201.0f),
                    PathNode.CurveTo(79.61116f, 210.38882f, 64.38884f, 210.38882f, 55.0f, 201.0f),
                    PathNode.CurveTo(45.61116f, 191.61118f, 45.61116f, 176.38882f, 55.0f, 167.0f),
                    PathNode.LineTo(82.72f, 139.28f),
                    PathNode.LineTo(116.66f, 173.22f),
                    PathNode.Close,
                    PathNode.MoveTo(201.0f, 201.0f),
                    PathNode.CurveTo(196.49675f, 205.5189f, 190.37964f, 208.05893f, 184.0f, 208.05893f),
                    PathNode.CurveTo(177.62036f, 208.05893f, 171.50325f, 205.5189f, 167.0f, 201.0f),
                    PathNode.LineTo(139.28f, 173.28f),
                    PathNode.LineTo(173.22f, 139.34f),
                    PathNode.LineTo(201.0f, 167.0f),
                    PathNode.CurveTo(205.5189f, 171.50325f, 208.05893f, 177.62036f, 208.05893f, 184.0f),
                    PathNode.CurveTo(208.05893f, 190.37964f, 205.5189f, 196.49675f, 201.0f, 201.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
