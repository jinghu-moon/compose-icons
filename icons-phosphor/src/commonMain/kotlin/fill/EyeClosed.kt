package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorFillIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.94f, 164.0f),
                    PathNode.CurveTo(233.14914f, 167.83562f, 231.83061f, 172.73586f, 227.995f, 174.945f),
                    PathNode.CurveTo(224.15938f, 177.15414f, 219.25914f, 175.83562f, 217.05f, 172.0f),
                    PathNode.LineTo(198.05f, 138.8f),
                    PathNode.CurveTo(187.01309f, 146.26585f, 174.83836f, 151.89224f, 162.0f, 155.46f),
                    PathNode.LineTo(167.87f, 190.68f),
                    PathNode.CurveTo(168.2198f, 192.77402f, 167.72289f, 194.9212f, 166.48872f, 196.64867f),
                    PathNode.CurveTo(165.25456f, 198.37613f, 163.38435f, 199.54218f, 161.29f, 199.89f),
                    PathNode.CurveTo(160.86348f, 199.9598f, 160.43219f, 199.99658f, 160.0f, 200.0f),
                    PathNode.CurveTo(156.09184f, 199.99413f, 152.75996f, 197.1654f, 152.12f, 193.31f),
                    PathNode.LineTo(146.35f, 158.73f),
                    PathNode.CurveTo(134.18196f, 160.42331f, 121.838036f, 160.42331f, 109.67f, 158.73f),
                    PathNode.LineTo(103.9f, 193.31f),
                    PathNode.CurveTo(103.258804f, 197.17287f, 99.915726f, 200.0039f, 96.0f, 200.0f),
                    PathNode.CurveTo(95.55779f, 199.99814f, 95.11642f, 199.96135f, 94.68f, 199.89f),
                    PathNode.CurveTo(92.58565f, 199.54218f, 90.71545f, 198.37613f, 89.48128f, 196.64867f),
                    PathNode.CurveTo(88.24711f, 194.9212f, 87.750206f, 192.77402f, 88.1f, 190.68f),
                    PathNode.LineTo(94.0f, 155.46f),
                    PathNode.CurveTo(81.156296f, 151.88396f, 68.97802f, 146.24738f, 57.94f, 138.77f),
                    PathNode.LineTo(39.0f, 172.0f),
                    PathNode.CurveTo(36.79086f, 175.84943f, 31.879425f, 177.17914f, 28.03f, 174.97f),
                    PathNode.CurveTo(24.180574f, 172.76086f, 22.85086f, 167.84943f, 25.06f, 164.0f),
                    PathNode.LineTo(45.06f, 129.0f),
                    PathNode.CurveTo(38.032448f, 122.93349f, 31.572395f, 116.239136f, 25.76f, 109.0f),
                    PathNode.CurveTo(23.387814f, 106.06619f, 23.387814f, 101.8738f, 25.76f, 98.94f),
                    PathNode.CurveTo(44.56f, 75.72f, 77.55f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(178.45f, 48.0f, 211.44f, 75.72f, 230.22f, 99.0f),
                    PathNode.CurveTo(232.5922f, 101.93381f, 232.5922f, 106.1262f, 230.22f, 109.06f),
                    PathNode.CurveTo(224.40762f, 116.29913f, 217.94756f, 122.9935f, 210.92f, 129.06f),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
