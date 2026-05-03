package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorBoldIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(114.0f, 145.34f),
                    PathNode.CurveTo(111.7767f, 141.98825f, 108.02209f, 139.97325f, 104.0f, 139.97325f),
                    PathNode.CurveTo(99.97791f, 139.97325f, 96.2233f, 141.98825f, 94.0f, 145.34f),
                    PathNode.LineTo(79.0f, 167.82f),
                    PathNode.LineTo(72.3f, 157.73f),
                    PathNode.CurveTo(70.05362f, 154.36627f, 66.2638f, 152.36057f, 62.21909f, 152.39482f),
                    PathNode.CurveTo(58.174374f, 152.4291f, 54.41908f, 154.4987f, 52.23f, 157.9f),
                    PathNode.LineTo(13.91f, 217.51f),
                    PathNode.CurveTo(11.536152f, 221.20192f, 11.367372f, 225.89532f, 13.469899f, 229.74821f),
                    PathNode.CurveTo(15.572426f, 233.60112f, 19.61076f, 235.9987f, 24.0f, 236.0f),
                    PathNode.LineTo(152.0f, 236.0f),
                    PathNode.CurveTo(156.42952f, 236.00658f, 160.50243f, 233.57246f, 162.59473f, 229.66824f),
                    PathNode.CurveTo(164.68701f, 225.76402f, 164.45839f, 221.02469f, 162.0f, 217.34f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 212.0f),
                    PathNode.LineTo(62.5f, 186.3f),
                    PathNode.LineTo(69.05f, 196.11f),
                    PathNode.CurveTo(71.27329f, 199.46175f, 75.02791f, 201.47675f, 79.05f, 201.47675f),
                    PathNode.CurveTo(83.07209f, 201.47675f, 86.826706f, 199.46175f, 89.05f, 196.11f),
                    PathNode.LineTo(104.05f, 173.63f),
                    PathNode.LineTo(129.58f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.49f, 79.51f),
                    PathNode.LineTo(160.49f, 23.51f),
                    PathNode.CurveTo(158.23764f, 21.260138f, 155.18355f, 19.997498f, 152.0f, 20.0f),
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
                    PathNode.CurveTo(189.37259f, 212.0f, 184.0f, 217.37259f, 184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 230.62741f, 189.37259f, 236.0f, 196.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0025f, 84.816444f, 218.73987f, 81.76237f, 216.49f, 79.51f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 57.0f),
                    PathNode.LineTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
