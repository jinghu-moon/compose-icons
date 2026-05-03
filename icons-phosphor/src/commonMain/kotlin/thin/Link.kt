package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorThinIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 88.12f),
                    PathNode.CurveTo(235.63828f, 101.03103f, 230.33743f, 113.31134f, 221.19f, 122.43f),
                    PathNode.LineTo(186.44f, 157.17f),
                    PathNode.CurveTo(176.9593f, 166.69814f, 164.06125f, 172.0381f, 150.62f, 172.0f),
                    PathNode.LineTo(150.57f, 172.0f),
                    PathNode.CurveTo(136.91173f, 171.98882f, 123.83733f, 166.45984f, 114.31505f, 156.66827f),
                    PathNode.CurveTo(104.792755f, 146.87672f, 99.63042f, 133.65327f, 100.0f, 120.0f),
                    PathNode.CurveTo(100.059586f, 117.83393f, 101.833115f, 116.109184f, 104.0f, 116.11f),
                    PathNode.LineTo(104.11f, 116.11f),
                    PathNode.CurveTo(105.171f, 116.13878f, 106.17706f, 116.58806f, 106.90666f, 117.358925f),
                    PathNode.CurveTo(107.63627f, 118.12979f, 108.02958f, 119.15902f, 108.0f, 120.22f),
                    PathNode.CurveTo(107.692566f, 131.71463f, 112.040634f, 142.8462f, 120.05772f, 151.08923f),
                    PathNode.CurveTo(128.0748f, 159.33226f, 139.08127f, 163.98793f, 150.58f, 164.0f),
                    PathNode.LineTo(150.58f, 164.0f),
                    PathNode.CurveTo(161.89218f, 164.03224f, 172.74641f, 159.53426f, 180.72f, 151.51f),
                    PathNode.LineTo(215.47f, 116.77f),
                    PathNode.CurveTo(226.41548f, 106.03624f, 230.75473f, 90.252f, 226.83437f, 75.431465f),
                    PathNode.CurveTo(222.914f, 60.610935f, 211.33783f, 49.03668f, 196.51665f, 45.118774f),
                    PathNode.CurveTo(181.69547f, 41.20087f, 165.91194f, 45.542732f, 155.18f, 56.49f),
                    PathNode.LineTo(144.18f, 67.49f),
                    PathNode.CurveTo(142.60867f, 68.98554f, 140.13164f, 68.95604f, 138.59637f, 67.42349f),
                    PathNode.CurveTo(137.06113f, 65.890945f, 137.02724f, 63.41397f, 138.52f, 61.84f),
                    PathNode.LineTo(149.52f, 50.84f),
                    PathNode.CurveTo(164.18716f, 36.12755f, 186.35226f, 31.865582f, 205.42972f, 40.089527f),
                    PathNode.CurveTo(224.50716f, 48.313477f, 236.62659f, 67.3549f, 236.0f, 88.12f),
                    PathNode.Close,
                    PathNode.MoveTo(111.78f, 188.49f),
                    PathNode.LineTo(100.78f, 199.49f),
                    PathNode.CurveTo(92.79934f, 207.53053f, 81.92871f, 212.03654f, 70.6f, 212.0f),
                    PathNode.LineTo(70.6f, 212.0f),
                    PathNode.CurveTo(53.365696f, 211.9847f, 37.835987f, 201.59381f, 31.24674f, 185.66888f),
                    PathNode.CurveTo(24.657492f, 169.74396f, 28.305096f, 151.41809f, 40.49f, 139.23f),
                    PathNode.LineTo(75.24f, 104.49f),
                    PathNode.CurveTo(87.584656f, 92.1432f, 106.21018f, 88.5719f, 122.24622f, 95.47692f),
                    PathNode.CurveTo(138.28227f, 102.38194f, 148.48682f, 118.367294f, 148.0f, 135.82f),
                    PathNode.CurveTo(147.9365f, 138.02916f, 149.67586f, 139.87149f, 151.885f, 139.935f),
                    PathNode.CurveTo(154.09413f, 139.9985f, 155.9365f, 138.25914f, 156.0f, 136.05f),
                    PathNode.CurveTo(156.5878f, 115.30916f, 144.46355f, 96.30826f, 125.40564f, 88.10311f),
                    PathNode.CurveTo(106.34775f, 79.897964f, 84.21268f, 84.148926f, 69.55f, 98.83f),
                    PathNode.LineTo(34.8f, 133.57f),
                    PathNode.CurveTo(20.325747f, 148.0449f, 15.991829f, 169.8115f, 23.817852f, 188.72658f),
                    PathNode.CurveTo(31.643875f, 207.64165f, 50.089863f, 219.98317f, 70.56f, 220.0f),
                    PathNode.LineTo(70.56f, 220.0f),
                    PathNode.CurveTo(83.99779f, 220.03543f, 96.89174f, 214.69565f, 106.37f, 205.17f),
                    PathNode.LineTo(117.37f, 194.17f),
                    PathNode.CurveTo(118.42461f, 193.16978f, 118.85367f, 191.67625f, 118.490715f, 190.26883f),
                    PathNode.CurveTo(118.12776f, 188.86142f, 117.02992f, 187.76163f, 115.62314f, 187.3962f),
                    PathNode.CurveTo(114.21636f, 187.03075f, 112.72205f, 187.45717f, 111.72f, 188.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _link!!
    }

private var _link: ImageVector? = null
