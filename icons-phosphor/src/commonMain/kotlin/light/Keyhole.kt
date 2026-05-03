package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorLightIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 112.0f),
                    PathNode.CurveTo(166.00102f, 94.24004f, 153.70035f, 78.84803f, 136.37733f, 74.93274f),
                    PathNode.CurveTo(119.05434f, 71.01744f, 101.32975f, 79.62323f, 93.69273f, 95.657326f),
                    PathNode.CurveTo(86.055725f, 111.69142f, 90.54339f, 130.87686f, 104.5f, 141.86f),
                    PathNode.LineTo(90.5f, 173.58f),
                    PathNode.CurveTo(89.681435f, 175.4371f, 89.85715f, 177.58212f, 90.967026f, 179.28125f),
                    PathNode.CurveTo(92.076904f, 180.98038f, 93.970505f, 182.00328f, 96.0f, 182.0f),
                    PathNode.LineTo(160.0f, 182.0f),
                    PathNode.CurveTo(162.02773f, 181.9999f, 163.91821f, 180.97562f, 165.0257f, 179.27705f),
                    PathNode.CurveTo(166.1332f, 177.57849f, 166.30785f, 175.43547f, 165.49f, 173.58f),
                    PathNode.LineTo(151.49f, 141.86f),
                    PathNode.CurveTo(160.62975f, 134.64229f, 165.97322f, 123.64601f, 166.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(141.0f, 134.53f),
                    PathNode.CurveTo(138.35126f, 136.0609f, 137.2785f, 139.3395f, 138.51f, 142.14f),
                    PathNode.LineTo(150.8f, 170.0f),
                    PathNode.LineTo(105.2f, 170.0f),
                    PathNode.LineTo(117.49f, 142.14f),
                    PathNode.CurveTo(118.7215f, 139.3395f, 117.64874f, 136.0609f, 115.0f, 134.53f),
                    PathNode.CurveTo(104.80883f, 128.64613f, 99.84021f, 116.65082f, 102.885925f, 105.28404f),
                    PathNode.CurveTo(105.93165f, 93.917274f, 116.232254f, 86.013336f, 128.0f, 86.013336f),
                    PathNode.CurveTo(139.76775f, 86.013336f, 150.06836f, 93.917274f, 153.11407f, 105.28404f),
                    PathNode.CurveTo(156.15979f, 116.65082f, 151.19116f, 128.64613f, 141.0f, 134.53f),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
