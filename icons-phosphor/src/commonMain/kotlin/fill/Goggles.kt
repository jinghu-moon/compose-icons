package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorFillIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.CurveTo(32.253773f, 64.04409f, 0.044089f, 96.25378f, 0f, 136.0f),
                    PathNode.CurveTo(3.82E-4f, 146.5682f, 6.897011f, 155.89894f, 17.0f, 159.0f),
                    PathNode.CurveTo(23.06f, 179.37f, 54.63f, 192.0f, 72.0f, 192.0f),
                    PathNode.CurveTo(91.00108f, 191.97679f, 107.37324f, 178.61176f, 111.2f, 160.0f),
                    PathNode.LineTo(144.8f, 160.0f),
                    PathNode.CurveTo(148.62675f, 178.61176f, 164.99892f, 191.97679f, 184.0f, 192.0f),
                    PathNode.CurveTo(201.33f, 192.0f, 232.9f, 179.34f, 239.0f, 159.0f),
                    PathNode.CurveTo(249.103f, 155.89894f, 255.99962f, 146.5682f, 256.0f, 136.0f),
                    PathNode.CurveTo(255.95592f, 96.25378f, 223.74623f, 64.04409f, 184.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(89.0f, 169.0f),
                    PathNode.CurveTo(85.87623f, 172.12172f, 80.81377f, 172.12172f, 77.69f, 169.0f),
                    PathNode.LineTo(53.14f, 144.45f),
                    PathNode.CurveTo(50.151768f, 141.30469f, 50.215195f, 136.35075f, 53.282974f, 133.28297f),
                    PathNode.CurveTo(56.350746f, 130.2152f, 61.304688f, 130.15176f, 64.45f, 133.14f),
                    PathNode.LineTo(89.0f, 157.65f),
                    PathNode.CurveTo(90.51142f, 159.15175f, 91.36135f, 161.19437f, 91.36135f, 163.325f),
                    PathNode.CurveTo(91.36135f, 165.45564f, 90.51142f, 167.49826f, 89.0f, 169.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.52f, 168.51f),
                    PathNode.CurveTo(205.39622f, 171.63173f, 200.33377f, 171.63173f, 197.21f, 168.51f),
                    PathNode.LineTo(171.8f, 143.11f),
                    PathNode.CurveTo(168.67409f, 139.98407f, 168.67409f, 134.91594f, 171.8f, 131.79f),
                    PathNode.CurveTo(174.92593f, 128.66406f, 179.99406f, 128.66406f, 183.12f, 131.79f),
                    PathNode.LineTo(208.52f, 157.2f),
                    PathNode.CurveTo(211.61075f, 160.33128f, 211.59288f, 165.37073f, 208.48f, 168.48f),
                    PathNode.Close,
                    PathNode.MoveTo(237.72f, 141.65f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _goggles!!
    }

private var _goggles: ImageVector? = null
