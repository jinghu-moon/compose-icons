package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorBoldIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 79.52f),
                    PathNode.LineTo(160.49f, 23.52f),
                    PathNode.CurveTo(158.23927f, 21.26647f, 155.185f, 20.000149f, 152.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 124.0f),
                    PathNode.CurveTo(36.0f, 130.62741f, 41.37258f, 136.0f, 48.0f, 136.0f),
                    PathNode.CurveTo(54.62742f, 136.0f, 60.0f, 130.62741f, 60.0f, 124.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 98.62742f, 141.37259f, 104.0f, 148.0f, 104.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.CurveTo(173.37259f, 212.0f, 168.0f, 217.37259f, 168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 230.62741f, 173.37259f, 236.0f, 180.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(219.99985f, 84.819916f, 218.73741f, 81.76991f, 216.49f, 79.52f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 57.0f),
                    PathNode.LineTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 124.0f),
                    PathNode.CurveTo(86.32988f, 123.99576f, 66.60236f, 136.4944f, 57.35f, 156.09f),
                    PathNode.CurveTo(35.83545f, 157.53558f, 19.338875f, 175.77457f, 20.053562f, 197.32578f),
                    PathNode.CurveTo(20.768251f, 218.87697f, 38.436947f, 235.98297f, 60.0f, 236.0f),
                    PathNode.LineTo(108.0f, 236.0f),
                    PathNode.CurveTo(138.92795f, 236.0f, 164.0f, 210.92795f, 164.0f, 180.0f),
                    PathNode.CurveTo(164.0f, 149.07205f, 138.92795f, 124.0f, 108.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.CurveTo(52.45414f, 211.99754f, 45.93572f, 206.7233f, 44.358593f, 199.34409f),
                    PathNode.CurveTo(42.781467f, 191.96487f, 46.5744f, 184.48683f, 53.46f, 181.4f),
                    PathNode.CurveTo(55.869637f, 186.18636f, 61.16068f, 188.79495f, 66.424644f, 187.79185f),
                    PathNode.CurveTo(71.68861f, 186.78874f, 75.64949f, 182.4171f, 76.13f, 177.08f),
                    PathNode.CurveTo(76.29095f, 175.2911f, 76.59865f, 173.51848f, 77.05f, 171.78f),
                    PathNode.CurveTo(77.17f, 171.42f, 77.27f, 171.06f, 77.36f, 170.69f),
                    PathNode.CurveTo(82.146645f, 154.94923f, 98.0893f, 145.40317f, 114.22498f, 148.61615f),
                    PathNode.CurveTo(130.36067f, 151.82913f, 141.4306f, 166.75401f, 139.82253f, 183.12772f),
                    PathNode.CurveTo(138.21445f, 199.5014f, 124.45246f, 211.98753f, 108.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
