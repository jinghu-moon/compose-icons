package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorLightIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.25f, 91.75f),
                    PathNode.CurveTo(165.37666f, 92.875404f, 166.0097f, 94.40254f, 166.0097f, 95.995f),
                    PathNode.CurveTo(166.0097f, 97.587456f, 165.37666f, 99.11459f, 164.25f, 100.24f),
                    PathNode.LineTo(100.25f, 164.24f),
                    PathNode.CurveTo(97.90282f, 166.55208f, 94.13037f, 166.53899f, 91.7993f, 164.21066f),
                    PathNode.CurveTo(89.46823f, 161.88234f, 89.45068f, 158.10991f, 91.76f, 155.76f),
                    PathNode.LineTo(155.76f, 91.76f),
                    PathNode.CurveTo(156.88408f, 90.63201f, 158.41048f, 89.997154f, 160.00293f, 89.99528f),
                    PathNode.CurveTo(161.59538f, 89.9934f, 163.12326f, 90.624664f, 164.25f, 91.75f),
                    PathNode.Close,
                    PathNode.MoveTo(214.2f, 41.8f),
                    PathNode.CurveTo(193.09428f, 20.741972f, 158.92574f, 20.741972f, 137.82f, 41.8f),
                    PathNode.LineTo(107.75f, 71.85f),
                    PathNode.CurveTo(105.405556f, 74.19445f, 105.405556f, 77.99555f, 107.75f, 80.34f),
                    PathNode.CurveTo(110.094444f, 82.68445f, 113.89555f, 82.68445f, 116.24f, 80.34f),
                    PathNode.LineTo(146.31f, 50.28f),
                    PathNode.CurveTo(162.71562f, 33.874386f, 189.31438f, 33.874386f, 205.72f, 50.28f),
                    PathNode.CurveTo(222.12561f, 66.685616f, 222.12563f, 93.28438f, 205.72f, 109.69f),
                    PathNode.LineTo(175.64f, 139.76f),
                    PathNode.CurveTo(173.29555f, 142.10445f, 173.29555f, 145.90555f, 175.64f, 148.25f),
                    PathNode.CurveTo(177.98445f, 150.59445f, 181.78555f, 150.59445f, 184.13f, 148.25f),
                    PathNode.LineTo(214.2f, 118.18f),
                    PathNode.CurveTo(224.33078f, 108.05253f, 230.02248f, 94.31474f, 230.02248f, 79.99f),
                    PathNode.CurveTo(230.02248f, 65.66525f, 224.33078f, 51.92747f, 214.2f, 41.8f),
                    PathNode.Close,
                    PathNode.MoveTo(139.76f, 175.64f),
                    PathNode.LineTo(109.69f, 205.72f),
                    PathNode.CurveTo(93.28438f, 222.12563f, 66.685616f, 222.12561f, 50.28f, 205.72f),
                    PathNode.CurveTo(33.874386f, 189.31438f, 33.874386f, 162.71562f, 50.28f, 146.31f),
                    PathNode.LineTo(80.34f, 116.24f),
                    PathNode.CurveTo(82.68445f, 113.89555f, 82.68445f, 110.094444f, 80.34f, 107.75f),
                    PathNode.CurveTo(77.99555f, 105.405556f, 74.19445f, 105.405556f, 71.85f, 107.75f),
                    PathNode.LineTo(41.85f, 137.82f),
                    PathNode.CurveTo(20.755484f, 158.91176f, 20.753246f, 193.11049f, 41.845f, 214.205f),
                    PathNode.CurveTo(62.936756f, 235.29951f, 97.13548f, 235.30176f, 118.23f, 214.21f),
                    PathNode.LineTo(148.3f, 184.13f),
                    PathNode.CurveTo(150.64445f, 181.78555f, 150.64445f, 177.98445f, 148.3f, 175.64f),
                    PathNode.CurveTo(145.95555f, 173.29555f, 142.15445f, 173.29555f, 139.81f, 175.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
