package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorDuotoneIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 152.0f),
                    PathNode.CurveTo(232.0f, 169.67f, 201.67f, 184.0f, 184.0f, 184.0f),
                    PathNode.CurveTo(166.32689f, 184.0f, 152.0f, 169.67311f, 152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 134.32689f, 166.32689f, 120.0f, 184.0f, 120.0f),
                    PathNode.CurveTo(201.67f, 120.0f, 232.0f, 134.33f, 232.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 120.0f),
                    PathNode.CurveTo(54.33f, 120.0f, 24.0f, 134.33f, 24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 169.67f, 54.33f, 184.0f, 72.0f, 184.0f),
                    PathNode.CurveTo(89.67311f, 184.0f, 104.0f, 169.67311f, 104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 134.32689f, 89.67311f, 120.0f, 72.0f, 120.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 136.0f),
                    PathNode.CurveTo(255.95592f, 96.25378f, 223.74623f, 64.04409f, 184.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.CurveTo(32.253773f, 64.04409f, 0.044089f, 96.25378f, 0f, 136.0f),
                    PathNode.CurveTo(3.82E-4f, 146.5682f, 6.897011f, 155.89894f, 17.0f, 159.0f),
                    PathNode.CurveTo(23.06f, 179.37f, 54.63f, 192.0f, 72.0f, 192.0f),
                    PathNode.CurveTo(91.00108f, 191.97679f, 107.37324f, 178.61176f, 111.2f, 160.0f),
                    PathNode.LineTo(144.8f, 160.0f),
                    PathNode.CurveTo(148.62675f, 178.61176f, 164.99892f, 191.97679f, 184.0f, 192.0f),
                    PathNode.CurveTo(201.33f, 192.0f, 232.9f, 179.34f, 239.0f, 159.0f),
                    PathNode.CurveTo(249.103f, 155.89894f, 255.99962f, 146.5682f, 256.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(45.45f, 167.74f),
                    PathNode.CurveTo(37.0f, 162.76f, 32.0f, 156.88f, 32.0f, 152.0f),
                    PathNode.CurveTo(32.0f, 147.12f, 36.91f, 141.39f, 45.13f, 136.45f),
                    PathNode.LineTo(82.34f, 173.65f),
                    PathNode.CurveTo(79.11459f, 175.2029f, 75.579765f, 176.00627f, 72.0f, 176.0f),
                    PathNode.CurveTo(64.47f, 176.0f, 53.8f, 172.68f, 45.45f, 167.74f),
                    PathNode.Close,
                    PathNode.MoveTo(93.65f, 162.34f),
                    PathNode.LineTo(61.0f, 129.7f),
                    PathNode.CurveTo(64.576836f, 128.65604f, 68.27489f, 128.08453f, 72.0f, 128.0f),
                    PathNode.CurveTo(85.25484f, 128.0f, 96.0f, 138.74516f, 96.0f, 152.0f),
                    PathNode.CurveTo(96.00627f, 155.57976f, 95.2029f, 159.1146f, 93.65f, 162.34f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.CurveTo(159.99472f, 146.4461f, 161.92548f, 141.06404f, 165.46f, 136.78f),
                    PathNode.LineTo(201.0f, 172.32f),
                    PathNode.CurveTo(195.0f, 174.62f, 188.85f, 176.0f, 184.0f, 176.0f),
                    PathNode.CurveTo(170.74516f, 176.0f, 160.0f, 165.25484f, 160.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.63f, 164.31f),
                    PathNode.LineTo(179.71f, 128.39f),
                    PathNode.CurveTo(181.12555f, 128.13268f, 182.56125f, 128.00217f, 184.0f, 128.0f),
                    PathNode.CurveTo(191.53f, 128.0f, 202.2f, 131.32f, 210.55f, 136.26f),
                    PathNode.CurveTo(218.9f, 141.2f, 224.0f, 147.12f, 224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 155.79f, 221.0f, 160.2f, 215.63f, 164.31f),
                    PathNode.Close,
                    PathNode.MoveTo(237.68f, 141.62f),
                    PathNode.CurveTo(229.34f, 123.25f, 200.34f, 112.0f, 184.0f, 112.0f),
                    PathNode.CurveTo(164.99892f, 112.02322f, 148.62675f, 125.388245f, 144.8f, 144.0f),
                    PathNode.LineTo(111.2f, 144.0f),
                    PathNode.CurveTo(107.37324f, 125.388245f, 91.00108f, 112.02322f, 72.0f, 112.0f),
                    PathNode.CurveTo(55.66f, 112.0f, 26.66f, 123.25f, 18.32f, 141.62f),
                    PathNode.CurveTo(16.83719f, 140.12498f, 16.003586f, 138.10565f, 16.0f, 136.0f),
                    PathNode.CurveTo(16.03307f, 105.08576f, 41.085766f, 80.033066f, 72.0f, 80.0f),
                    PathNode.LineTo(184.0f, 80.0f),
                    PathNode.CurveTo(214.91423f, 80.033066f, 239.96693f, 105.08576f, 240.0f, 136.0f),
                    PathNode.CurveTo(239.99641f, 138.10565f, 239.16281f, 140.12498f, 237.68f, 141.62f),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
