package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorBoldIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 70.32689f, 185.67311f, 56.0f, 168.0f, 56.0f),
                    PathNode.CurveTo(150.32689f, 56.0f, 136.0f, 70.32689f, 136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 105.67311f, 150.32689f, 120.0f, 168.0f, 120.0f),
                    PathNode.CurveTo(185.67311f, 120.0f, 200.0f, 105.67311f, 200.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 96.0f),
                    PathNode.CurveTo(163.58173f, 96.0f, 160.0f, 92.41828f, 160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 83.58172f, 163.58173f, 80.0f, 168.0f, 80.0f),
                    PathNode.CurveTo(172.41827f, 80.0f, 176.0f, 83.58172f, 176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 92.41828f, 172.41827f, 96.0f, 168.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.06f, 208.28f),
                    PathNode.LineTo(212.31f, 139.52f),
                    PathNode.CurveTo(233.83676f, 120.976105f, 241.56485f, 91.00302f, 231.68823f, 64.36226f),
                    PathNode.CurveTo(221.81163f, 37.7215f, 196.41261f, 20.029726f, 168.0f, 20.0f),
                    PathNode.CurveTo(167.33f, 19.996504f, 166.66092f, 20.050032f, 166.0f, 20.16f),
                    PathNode.LineTo(28.71f, 43.05f),
                    PathNode.CurveTo(19.053131f, 44.635178f, 11.973825f, 52.993927f, 12.0f, 62.78f),
                    PathNode.LineTo(12.0f, 113.22f),
                    PathNode.CurveTo(11.949203f, 123.02497f, 19.034374f, 131.41185f, 28.71f, 133.0f),
                    PathNode.LineTo(124.0f, 148.83f),
                    PathNode.LineTo(124.0f, 200.0f),
                    PathNode.CurveTo(124.01181f, 209.75919f, 131.06538f, 218.08485f, 140.69f, 219.7f),
                    PathNode.CurveTo(144.44443f, 240.68391f, 162.68289f, 255.97035f, 184.0f, 256.0f),
                    PathNode.LineTo(200.0f, 256.0f),
                    PathNode.CurveTo(206.62741f, 256.0f, 212.0f, 250.62741f, 212.0f, 244.0f),
                    PathNode.CurveTo(212.0f, 237.37259f, 206.62741f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(184.0f, 232.0f),
                    PathNode.CurveTo(175.97314f, 231.99919f, 168.72449f, 227.19952f, 165.59f, 219.81f),
                    PathNode.CurveTo(172.37553f, 218.85638f, 178.20708f, 214.51006f, 181.06f, 208.28f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 66.17f),
                    PathNode.LineTo(168.93f, 44.0f),
                    PathNode.CurveTo(193.23053f, 44.0f, 212.93f, 63.69947f, 212.93f, 88.0f),
                    PathNode.CurveTo(212.93f, 112.30053f, 193.23053f, 132.0f, 168.93f, 132.0f),
                    PathNode.LineTo(36.0f, 109.83f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 155.84f),
                    PathNode.CurveTo(166.66092f, 155.94997f, 167.33f, 156.0035f, 168.0f, 156.0f),
                    PathNode.CurveTo(171.63435f, 155.99675f, 175.26262f, 155.70247f, 178.85f, 155.12f),
                    PathNode.LineTo(160.27f, 196.0f),
                    PathNode.LineTo(148.0f, 196.0f),
                    PathNode.LineTo(148.0f, 152.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
