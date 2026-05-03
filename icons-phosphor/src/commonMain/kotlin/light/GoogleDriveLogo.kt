package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorLightIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.9f, 144.82f),
                    PathNode.LineTo(167.43f, 32.58f),
                    PathNode.CurveTo(164.88437f, 28.474285f, 160.39082f, 25.983341f, 155.56f, 26.0f),
                    PathNode.LineTo(100.43f, 26.0f),
                    PathNode.CurveTo(95.59968f, 25.98528f, 91.10702f, 28.475737f, 88.56f, 32.58f),
                    PathNode.LineTo(88.56f, 32.63f),
                    PathNode.LineTo(20.13f, 144.76f),
                    PathNode.CurveTo(17.3974f, 149.13292f, 17.289822f, 154.65396f, 19.85f, 159.13f),
                    PathNode.LineTo(47.17f, 207.0f),
                    PathNode.CurveTo(49.675434f, 211.33955f, 54.309124f, 214.00917f, 59.32f, 214.0f),
                    PathNode.LineTo(196.67f, 214.0f),
                    PathNode.CurveTo(201.68445f, 214.01276f, 206.32278f, 211.34267f, 208.83f, 207.0f),
                    PathNode.LineTo(236.15f, 159.18f),
                    PathNode.CurveTo(238.7153f, 154.71198f, 238.61928f, 149.19603f, 235.9f, 144.82f),
                    PathNode.Close,
                    PathNode.MoveTo(222.56f, 146.0f),
                    PathNode.LineTo(171.39f, 146.0f),
                    PathNode.LineTo(135.0f, 85.33f),
                    PathNode.LineTo(160.08f, 43.54f),
                    PathNode.Close,
                    PathNode.MoveTo(98.56f, 146.0f),
                    PathNode.LineTo(128.0f, 97.0f),
                    PathNode.LineTo(157.4f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.56f, 158.0f),
                    PathNode.LineTo(191.0f, 202.0f),
                    PathNode.LineTo(65.0f, 202.0f),
                    PathNode.LineTo(91.4f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 73.67f),
                    PathNode.LineTo(106.6f, 38.0f),
                    PathNode.LineTo(149.4f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.93f, 43.54f),
                    PathNode.LineTo(121.0f, 85.33f),
                    PathNode.LineTo(84.6f, 146.0f),
                    PathNode.LineTo(33.43f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(33.0f, 158.0f),
                    PathNode.LineTo(77.4f, 158.0f),
                    PathNode.LineTo(54.67f, 195.89f),
                    PathNode.Close,
                    PathNode.MoveTo(201.3f, 195.89f),
                    PathNode.LineTo(178.59f, 158.0f),
                    PathNode.LineTo(223.0f, 158.0f),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
