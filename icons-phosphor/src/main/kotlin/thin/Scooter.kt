package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorThinIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 140.0f),
                    PathNode.CurveTo(209.90448f, 139.9972f, 207.814f, 140.20491f, 205.76f, 140.62f),
                    PathNode.LineTo(171.76f, 38.74f),
                    PathNode.CurveTo(171.22133f, 37.116753f, 169.71022f, 36.01557f, 168.0f, 36.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.CurveTo(133.79086f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 42.20914f, 133.79086f, 44.0f, 136.0f, 44.0f),
                    PathNode.LineTo(165.12f, 44.0f),
                    PathNode.LineTo(184.12f, 101.14f),
                    PathNode.LineTo(126.12f, 172.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.CurveTo(75.96701f, 155.11108f, 62.8146f, 141.1554f, 45.957264f, 140.12242f),
                    PathNode.CurveTo(29.099932f, 139.08945f, 14.341986f, 151.33487f, 12.247169f, 168.0934f),
                    PathNode.CurveTo(10.152352f, 184.85193f, 21.441952f, 200.35329f, 38.034866f, 203.5016f),
                    PathNode.CurveTo(54.62778f, 206.6499f, 70.81075f, 196.36115f, 75.0f, 180.0f),
                    PathNode.LineTo(128.0f, 180.0f),
                    PathNode.CurveTo(129.19652f, 179.99998f, 130.3302f, 179.46432f, 131.09f, 178.54f),
                    PathNode.LineTo(187.15f, 110.11f),
                    PathNode.LineTo(198.15f, 143.11f),
                    PathNode.CurveTo(183.4421f, 150.11594f, 176.34538f, 167.05347f, 181.66624f, 182.45132f),
                    PathNode.CurveTo(186.98709f, 197.84918f, 203.02689f, 206.7917f, 218.92233f, 203.2224f),
                    PathNode.CurveTo(234.8178f, 199.65309f, 245.49442f, 184.71144f, 243.72125f, 168.51695f),
                    PathNode.CurveTo(241.94809f, 152.32246f, 228.29121f, 140.04512f, 212.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 196.0f),
                    PathNode.CurveTo(30.745167f, 196.0f, 20.0f, 185.25484f, 20.0f, 172.0f),
                    PathNode.CurveTo(20.0f, 158.74516f, 30.745167f, 148.0f, 44.0f, 148.0f),
                    PathNode.CurveTo(57.254833f, 148.0f, 68.0f, 158.74516f, 68.0f, 172.0f),
                    PathNode.CurveTo(68.0f, 185.25484f, 57.254833f, 196.0f, 44.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.CurveTo(198.74516f, 196.0f, 188.0f, 185.25484f, 188.0f, 172.0f),
                    PathNode.CurveTo(188.0f, 158.74516f, 198.74516f, 148.0f, 212.0f, 148.0f),
                    PathNode.CurveTo(225.25484f, 148.0f, 236.0f, 158.74516f, 236.0f, 172.0f),
                    PathNode.CurveTo(236.0f, 185.25484f, 225.25484f, 196.0f, 212.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scooter!!
    }

private var _scooter: ImageVector? = null
