package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorLightIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.85f, 90.72f),
                    PathNode.LineTo(234.85f, 90.72f),
                    PathNode.LineTo(130.85f, 34.72f),
                    PathNode.CurveTo(129.07657f, 33.767067f, 126.943436f, 33.767067f, 125.17f, 34.72f),
                    PathNode.LineTo(21.17f, 90.72f),
                    PathNode.LineTo(21.17f, 90.72f),
                    PathNode.CurveTo(19.221786f, 91.7621f, 18.003927f, 93.79059f, 18.0f, 96.0f),
                    PathNode.LineTo(18.0f, 160.0f),
                    PathNode.CurveTo(17.99997f, 162.20512f, 19.209522f, 164.23256f, 21.15f, 165.28f),
                    PathNode.LineTo(21.15f, 165.28f),
                    PathNode.LineTo(125.15f, 221.28f),
                    PathNode.CurveTo(126.92343f, 222.23293f, 129.05656f, 222.23293f, 130.83f, 221.28f),
                    PathNode.LineTo(234.83f, 165.28f),
                    PathNode.LineTo(234.83f, 165.28f),
                    PathNode.CurveTo(236.77821f, 164.2379f, 237.99608f, 162.20941f, 238.0f, 160.0f),
                    PathNode.LineTo(238.0f, 96.0f),
                    PathNode.CurveTo(238.00003f, 93.79488f, 236.79048f, 91.76743f, 234.85f, 90.72f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 150.0f),
                    PathNode.LineTo(185.23f, 128.0f),
                    PathNode.LineTo(226.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.57f, 121.23f),
                    PathNode.LineTo(134.0f, 100.42f),
                    PathNode.LineTo(134.0f, 50.0f),
                    PathNode.LineTo(219.34f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 145.23f),
                    PathNode.LineTo(96.08f, 128.0f),
                    PathNode.LineTo(128.0f, 110.81f),
                    PathNode.LineTo(159.92f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 50.0f),
                    PathNode.LineTo(122.0f, 100.38f),
                    PathNode.LineTo(83.43f, 121.18f),
                    PathNode.LineTo(36.66f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 106.0f),
                    PathNode.LineTo(70.77f, 128.0f),
                    PathNode.LineTo(30.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.43f, 134.76f),
                    PathNode.LineTo(122.0f, 155.58f),
                    PathNode.LineTo(122.0f, 206.0f),
                    PathNode.LineTo(36.66f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 206.0f),
                    PathNode.LineTo(134.0f, 155.58f),
                    PathNode.LineTo(172.57f, 134.81f),
                    PathNode.LineTo(219.34f, 160.0f),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
