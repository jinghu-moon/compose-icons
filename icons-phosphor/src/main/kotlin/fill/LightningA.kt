package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorFillIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.87f, 118.58f),
                    PathNode.LineTo(78.67f, 221.43f),
                    PathNode.CurveTo(76.204025f, 224.11394f, 72.23563f, 224.79178f, 69.01858f, 223.07852f),
                    PathNode.CurveTo(65.80154f, 221.36528f, 64.1492f, 217.6941f, 65.0f, 214.15f),
                    PathNode.LineTo(78.67f, 156.59f),
                    PathNode.LineTo(28.67f, 134.15f),
                    PathNode.CurveTo(26.321712f, 133.09389f, 24.625294f, 130.97205f, 24.111942f, 128.44888f),
                    PathNode.CurveTo(23.59859f, 125.925735f, 24.331062f, 123.30972f, 26.08f, 121.42f),
                    PathNode.LineTo(121.28f, 18.57f),
                    PathNode.CurveTo(123.7339f, 15.829886f, 127.74004f, 15.116175f, 130.98926f, 16.84025f),
                    PathNode.CurveTo(134.23848f, 18.564325f, 135.89334f, 22.281837f, 135.0f, 25.85f),
                    PathNode.LineTo(121.31f, 83.41f),
                    PathNode.LineTo(171.31f, 105.84f),
                    PathNode.CurveTo(173.66194f, 106.895226f, 175.36128f, 109.01911f, 175.87485f, 111.54525f),
                    PathNode.CurveTo(176.3884f, 114.07139f, 175.65323f, 116.69021f, 173.9f, 118.58f),
                    PathNode.Close,
                    PathNode.MoveTo(235.58f, 223.15f),
                    PathNode.CurveTo(234.47008f, 223.7108f, 233.24356f, 224.00201f, 232.0f, 224.0f),
                    PathNode.CurveTo(228.96869f, 224.00217f, 226.19652f, 222.29086f, 224.84f, 219.58f),
                    PathNode.LineTo(215.05f, 200.0f),
                    PathNode.LineTo(176.94f, 200.0f),
                    PathNode.LineTo(167.15f, 219.58f),
                    PathNode.CurveTo(165.17282f, 223.5316f, 160.3666f, 225.13219f, 156.415f, 223.155f),
                    PathNode.CurveTo(152.46341f, 221.17783f, 150.86282f, 216.3716f, 152.84f, 212.42f),
                    PathNode.LineTo(188.84f, 140.42f),
                    PathNode.CurveTo(190.1953f, 137.71019f, 192.96516f, 135.99855f, 195.995f, 135.99855f),
                    PathNode.CurveTo(199.02484f, 135.99855f, 201.7947f, 137.71019f, 203.15f, 140.42f),
                    PathNode.LineTo(239.15f, 212.42f),
                    PathNode.CurveTo(241.12491f, 216.369f, 239.52711f, 221.17133f, 235.58f, 223.15f),
                    PathNode.Close,
                    PathNode.MoveTo(207.05f, 184.0f),
                    PathNode.LineTo(196.0f, 161.89f),
                    PathNode.LineTo(184.94f, 184.0f),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
