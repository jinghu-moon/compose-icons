package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorThinIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 196.36f),
                    PathNode.CurveTo(235.70386f, 192.84372f, 233.87506f, 189.63599f, 231.0f, 187.59f),
                    PathNode.LineTo(189.13f, 157.7f),
                    PathNode.LineTo(209.42f, 137.41f),
                    PathNode.CurveTo(217.89528f, 129.01454f, 221.61404f, 116.93886f, 219.33f, 105.23f),
                    PathNode.CurveTo(214.86147f, 83.2992f, 202.82681f, 63.636703f, 185.33f, 49.68f),
                    PathNode.CurveTo(167.57256f, 35.408127f, 145.41043f, 27.74505f, 122.63f, 28.0f),
                    PathNode.CurveTo(70.74139f, 28.892296f, 28.892296f, 70.74139f, 28.0f, 122.63f),
                    PathNode.CurveTo(27.717543f, 145.41928f, 35.379578f, 167.5957f, 49.67f, 185.35f),
                    PathNode.CurveTo(63.6267f, 202.8468f, 83.2892f, 214.88145f, 105.22f, 219.35f),
                    PathNode.CurveTo(116.930756f, 221.6352f, 129.00842f, 217.91206f, 137.4f, 209.43f),
                    PathNode.LineTo(157.69f, 189.15f),
                    PathNode.LineTo(187.59f, 231.0f),
                    PathNode.CurveTo(189.63818f, 233.8776f, 192.85011f, 235.70671f, 196.37f, 236.0f),
                    PathNode.CurveTo(196.7f, 236.0f, 197.03f, 236.0f, 197.37f, 236.0f),
                    PathNode.CurveTo(200.55153f, 235.9972f, 203.60172f, 234.73108f, 205.85f, 232.48f),
                    PathNode.LineTo(232.49f, 205.84f),
                    PathNode.CurveTo(234.99887f, 203.35101f, 236.28302f, 199.88269f, 236.0f, 196.36f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 180.36f),
                    PathNode.CurveTo(42.83823f, 164.06206f, 35.76621f, 143.68756f, 36.0f, 122.74f),
                    PathNode.CurveTo(36.81766f, 75.173744f, 75.183655f, 36.81218f, 122.75f, 36.0f),
                    PathNode.CurveTo(143.67476f, 35.7466f, 164.03561f, 42.782215f, 180.34f, 55.9f),
                    PathNode.CurveTo(188.90205f, 62.78753f, 196.11667f, 71.198944f, 201.62f, 80.71f),
                    PathNode.LineTo(80.72f, 201.62f),
                    PathNode.CurveTo(71.20635f, 196.11617f, 62.79446f, 188.89774f, 55.91f, 180.33f),
                    PathNode.Close,
                    PathNode.MoveTo(226.92f, 200.21f),
                    PathNode.LineTo(200.27f, 226.86f),
                    PathNode.CurveTo(199.40952f, 227.7166f, 198.20653f, 228.13599f, 197.0f, 228.0f),
                    PathNode.CurveTo(195.82155f, 227.91339f, 194.74506f, 227.29982f, 194.07f, 226.33f),
                    PathNode.LineTo(161.43f, 180.64f),
                    PathNode.CurveTo(160.74739f, 179.68501f, 159.67976f, 179.07806f, 158.51f, 178.98f),
                    PathNode.LineTo(158.18f, 178.98f),
                    PathNode.CurveTo(157.11882f, 178.97917f, 156.10078f, 179.40002f, 155.35f, 180.15f),
                    PathNode.LineTo(131.72f, 203.78f),
                    PathNode.LineTo(131.72f, 203.78f),
                    PathNode.CurveTo(125.207565f, 210.38127f, 115.82056f, 213.27997f, 106.72f, 211.5f),
                    PathNode.CurveTo(100.30849f, 210.22736f, 94.066605f, 208.21385f, 88.12f, 205.5f),
                    PathNode.LineTo(205.47f, 88.18f),
                    PathNode.CurveTo(208.18385f, 94.12661f, 210.19736f, 100.368484f, 211.47f, 106.78f),
                    PathNode.CurveTo(213.24442f, 115.880264f, 210.34651f, 125.26468f, 203.75f, 131.78f),
                    PathNode.LineTo(180.12f, 155.41f),
                    PathNode.CurveTo(179.28943f, 156.24088f, 178.86612f, 157.39488f, 178.9624f, 158.56575f),
                    PathNode.CurveTo(179.05869f, 159.73663f, 179.66484f, 160.80597f, 180.62f, 161.49f),
                    PathNode.LineTo(226.31f, 194.13f),
                    PathNode.CurveTo(227.26657f, 194.81244f, 227.87468f, 195.88097f, 227.9729f, 197.05191f),
                    PathNode.CurveTo(228.07112f, 198.22284f, 227.6495f, 199.37775f, 226.82f, 200.21f),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
