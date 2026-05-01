package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorLightIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 86.0f),
                    PathNode.CurveTo(217.10457f, 86.0f, 218.0f, 86.89543f, 218.0f, 88.0f),
                    PathNode.LineTo(218.0f, 120.0f),
                    PathNode.CurveTo(218.0f, 123.313705f, 220.6863f, 126.0f, 224.0f, 126.0f),
                    PathNode.CurveTo(227.3137f, 126.0f, 230.0f, 123.313705f, 230.0f, 120.0f),
                    PathNode.LineTo(230.0f, 88.0f),
                    PathNode.CurveTo(230.0f, 80.26801f, 223.73198f, 74.0f, 216.0f, 74.0f),
                    PathNode.LineTo(130.48f, 74.0f),
                    PathNode.LineTo(102.58f, 46.1f),
                    PathNode.CurveTo(99.963005f, 43.467636f, 96.40186f, 41.991325f, 92.69f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.61f),
                    PathNode.CurveTo(25.999998f, 208.00119f, 31.988813f, 213.99448f, 39.38f, 214.0f),
                    PathNode.LineTo(120.56f, 214.0f),
                    PathNode.CurveTo(123.87371f, 214.0f, 126.56f, 211.3137f, 126.56f, 208.0f),
                    PathNode.CurveTo(126.56f, 204.6863f, 123.87371f, 202.0f, 120.56f, 202.0f),
                    PathNode.LineTo(39.38f, 202.0f),
                    PathNode.CurveTo(38.6185f, 201.98914f, 38.005363f, 201.37155f, 38.0f, 200.61f),
                    PathNode.LineTo(38.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 54.0f),
                    PathNode.LineTo(92.69f, 54.0f),
                    PathNode.CurveTo(93.21815f, 53.99958f, 93.72501f, 54.20808f, 94.1f, 54.58f),
                    PathNode.LineTo(113.52f, 74.0f),
                    PathNode.LineTo(38.0f, 74.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.72f, 159.8f),
                    PathNode.CurveTo(236.98093f, 157.46753f, 234.89958f, 155.81747f, 232.46f, 155.63f),
                    PathNode.LineTo(201.46f, 153.23f),
                    PathNode.LineTo(189.55f, 125.62f),
                    PathNode.CurveTo(188.5962f, 123.43232f, 186.43655f, 122.017914f, 184.05f, 122.017914f),
                    PathNode.CurveTo(181.66344f, 122.017914f, 179.5038f, 123.43232f, 178.55f, 125.62f),
                    PathNode.LineTo(166.64f, 153.23f),
                    PathNode.LineTo(135.64f, 155.63f),
                    PathNode.CurveTo(133.19981f, 155.81726f, 131.11794f, 157.46782f, 130.37906f, 159.80098f),
                    PathNode.CurveTo(129.64018f, 162.13414f, 130.39244f, 164.68222f, 132.28f, 166.24f),
                    PathNode.LineTo(155.77f, 185.63f),
                    PathNode.LineTo(148.61f, 214.56f),
                    PathNode.CurveTo(148.03021f, 216.90457f, 148.91272f, 219.36823f, 150.84932f, 220.8114f),
                    PathNode.CurveTo(152.78592f, 222.25458f, 155.39903f, 222.39589f, 157.48f, 221.17f),
                    PathNode.LineTo(184.0f, 205.5f),
                    PathNode.LineTo(210.62f, 221.17f),
                    PathNode.CurveTo(212.70096f, 222.39589f, 215.31406f, 222.25458f, 217.25069f, 220.8114f),
                    PathNode.CurveTo(219.18729f, 219.36823f, 220.0698f, 216.90457f, 219.49f, 214.56f),
                    PathNode.LineTo(212.33f, 185.63f),
                    PathNode.LineTo(235.82f, 166.24f),
                    PathNode.CurveTo(237.70763f, 164.68182f, 238.45953f, 162.13327f, 237.72f, 159.8f),
                    PathNode.Close,
                    PathNode.MoveTo(201.78f, 178.8f),
                    PathNode.CurveTo(200.00156f, 180.27039f, 199.22395f, 182.63042f, 199.78f, 184.87f),
                    PathNode.LineTo(204.42f, 203.61f),
                    PathNode.LineTo(187.0f, 193.36f),
                    PathNode.CurveTo(185.12337f, 192.25714f, 182.79663f, 192.25714f, 180.92f, 193.36f),
                    PathNode.LineTo(163.55f, 203.59f),
                    PathNode.LineTo(168.18f, 184.85f),
                    PathNode.CurveTo(168.73605f, 182.61041f, 167.95845f, 180.2504f, 166.18f, 178.78f),
                    PathNode.LineTo(151.24f, 166.45f),
                    PathNode.LineTo(171.07f, 164.92f),
                    PathNode.CurveTo(173.27486f, 164.73082f, 175.1966f, 163.34332f, 176.07f, 161.31f),
                    PathNode.LineTo(184.0f, 143.14f),
                    PathNode.LineTo(191.84f, 161.31f),
                    PathNode.CurveTo(192.7134f, 163.34332f, 194.63513f, 164.73082f, 196.84f, 164.92f),
                    PathNode.LineTo(216.67f, 166.45f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
