package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorDuotoneIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(157.7556f, 40.012295f, 185.48967f, 55.060627f, 201.72f, 80.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.CurveTo(107.27657f, 80.02325f, 88.899765f, 93.32225f, 82.4f, 113.0f),
                    PathNode.LineTo(59.32f, 73.0f),
                    PathNode.CurveTo(76.007034f, 52.1322f, 101.28068f, 39.988483f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 145.67311f, 145.67311f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(110.32689f, 160.0f, 96.0f, 145.67311f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 110.32689f, 110.32689f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(145.67311f, 96.0f, 160.0f, 110.32689f, 160.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(114.72f, 215.0f),
                    PathNode.CurveTo(86.8059f, 210.73535f, 62.633938f, 193.33417f, 49.73223f, 168.21584f),
                    PathNode.CurveTo(36.83053f, 143.0975f, 36.766468f, 113.31359f, 49.56f, 88.14f),
                    PathNode.LineTo(86.43f, 152.0f),
                    PathNode.CurveTo(86.49f, 152.1f, 86.56f, 152.19f, 86.62f, 152.28f),
                    PathNode.CurveTo(97.04016f, 170.05875f, 117.64569f, 179.20244f, 137.82f, 175.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.72f, 215.87f),
                    PathNode.LineTo(169.57f, 152.0f),
                    PathNode.CurveTo(169.65f, 151.86f, 169.71f, 151.72f, 169.79f, 151.58f),
                    PathNode.CurveTo(179.93587f, 133.68777f, 177.52065f, 111.314705f, 163.79f, 96.0f),
                    PathNode.LineTo(210.0f, 96.0f),
                    PathNode.CurveTo(220.26799f, 122.3087f, 217.2854f, 151.94699f, 201.98131f, 175.68228f),
                    PathNode.CurveTo(186.67722f, 199.41759f, 160.91135f, 214.36563f, 132.71f, 215.87f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
