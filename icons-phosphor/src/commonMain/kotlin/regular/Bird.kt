package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorRegularIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 68.0f),
                    PathNode.CurveTo(176.0f, 74.62742f, 170.62741f, 80.0f, 164.0f, 80.0f),
                    PathNode.CurveTo(157.37259f, 80.0f, 152.0f, 74.62742f, 152.0f, 68.0f),
                    PathNode.CurveTo(152.0f, 61.37258f, 157.37259f, 56.0f, 164.0f, 56.0f),
                    PathNode.CurveTo(170.62741f, 56.0f, 176.0f, 61.37258f, 176.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.00174f, 82.67564f, 238.66574f, 85.17502f, 236.44f, 86.66f),
                    PathNode.LineTo(216.0f, 100.28f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(215.93938f, 177.41248f, 169.41248f, 223.93938f, 112.0f, 224.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(17.848389f, 224.0f, 12.241518f, 220.47319f, 9.577792f, 214.9282f),
                    PathNode.CurveTo(6.914066f, 209.38322f, 7.665243f, 202.8021f, 11.51f, 198.0f),
                    PathNode.LineTo(11.61f, 197.88f),
                    PathNode.LineTo(96.0f, 96.63f),
                    PathNode.LineTo(96.0f, 76.89f),
                    PathNode.CurveTo(96.0f, 43.47f, 122.79f, 16.16f, 155.71f, 16.0f),
                    PathNode.LineTo(156.0f, 16.0f),
                    PathNode.CurveTo(182.15547f, 15.992213f, 205.30234f, 32.928547f, 213.21f, 57.86f),
                    PathNode.LineTo(236.44f, 73.34f),
                    PathNode.CurveTo(238.66574f, 74.82498f, 240.00174f, 77.32436f, 240.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.58f, 80.0f),
                    PathNode.LineTo(201.9f, 69.54f),
                    PathNode.CurveTo(200.26443f, 68.45215f, 199.08627f, 66.80058f, 198.59f, 64.9f),
                    PathNode.CurveTo(193.5369f, 45.517506f, 176.03035f, 31.994024f, 156.0f, 32.0f),
                    PathNode.LineTo(155.78f, 32.0f),
                    PathNode.CurveTo(131.64f, 32.12f, 112.0f, 52.25f, 112.0f, 76.89f),
                    PathNode.LineTo(112.0f, 99.52f),
                    PathNode.CurveTo(112.00318f, 101.39389f, 111.34845f, 103.20944f, 110.15f, 104.65f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.LineTo(50.9f, 208.0f),
                    PathNode.LineTo(121.84f, 122.88f),
                    PathNode.CurveTo(123.64953f, 120.619576f, 126.53924f, 119.51335f, 129.39563f, 119.987595f),
                    PathNode.CurveTo(132.25203f, 120.46184f, 134.62923f, 122.44251f, 135.61122f, 125.16641f),
                    PathNode.CurveTo(136.59322f, 127.890305f, 136.0267f, 130.93222f, 134.13f, 133.12f),
                    PathNode.LineTo(71.75f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(160.57822f, 207.94489f, 199.94489f, 168.57822f, 200.0f, 120.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.CurveTo(199.99826f, 93.32436f, 201.33426f, 90.82498f, 203.56f, 89.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bird!!
    }

private var _bird: ImageVector? = null
