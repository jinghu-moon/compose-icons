package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorRegularIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.87f, 32.13f),
                    PathNode.CurveTo(221.00374f, 21.292229f, 203.41626f, 21.292229f, 192.55f, 32.13f),
                    PathNode.LineTo(18.34f, 206.4f),
                    PathNode.CurveTo(16.284666f, 208.45679f, 15.507147f, 211.46681f, 16.309248f, 214.2617f),
                    PathNode.CurveTo(17.111347f, 217.05658f, 19.366756f, 219.19618f, 22.2f, 219.85f),
                    PathNode.CurveTo(34.070263f, 222.60153f, 46.215008f, 223.99382f, 58.4f, 224.0f),
                    PathNode.CurveTo(91.35f, 224.0f, 124.32f, 213.8f, 155.35f, 193.77f),
                    PathNode.CurveTo(187.11f, 173.27f, 205.54f, 149.95f, 206.35f, 148.96f),
                    PathNode.CurveTo(208.84464f, 145.77583f, 208.56995f, 141.23056f, 205.71f, 138.37f),
                    PathNode.LineTo(185.32f, 118.0f),
                    PathNode.LineTo(231.87f, 71.44f),
                    PathNode.CurveTo(242.69563f, 60.57263f, 242.69563f, 42.997368f, 231.87f, 32.13f),
                    PathNode.Close,
                    PathNode.MoveTo(189.1f, 144.44f),
                    PathNode.CurveTo(176.41115f, 158.26897f, 162.00793f, 170.42062f, 146.24f, 180.6f),
                    PathNode.CurveTo(111.81f, 202.7f, 76.3f, 211.52f, 40.47f, 206.9f),
                    PathNode.LineTo(146.0f, 101.33f),
                    PathNode.Close,
                    PathNode.MoveTo(220.56f, 60.14f),
                    PathNode.LineTo(174.0f, 106.7f),
                    PathNode.LineTo(157.32f, 90.0f),
                    PathNode.LineTo(203.87f, 43.44f),
                    PathNode.CurveTo(208.47882f, 38.831184f, 215.95119f, 38.831184f, 220.56f, 43.44f),
                    PathNode.CurveTo(225.16882f, 48.048817f, 225.16882f, 55.521183f, 220.56f, 60.13f),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
