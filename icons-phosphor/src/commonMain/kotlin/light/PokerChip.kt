package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorLightIcon(
            name = "PokerChip",
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
                    PathNode.MoveTo(128.0f, 178.0f),
                    PathNode.CurveTo(100.385765f, 178.0f, 78.0f, 155.61424f, 78.0f, 128.0f),
                    PathNode.CurveTo(78.0f, 100.385765f, 100.385765f, 78.0f, 128.0f, 78.0f),
                    PathNode.CurveTo(155.61424f, 78.0f, 178.0f, 100.385765f, 178.0f, 128.0f),
                    PathNode.CurveTo(177.96693f, 155.60052f, 155.60052f, 177.96693f, 128.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.37f, 80.14f),
                    PathNode.CurveTo(157.87727f, 72.29957f, 146.25534f, 67.47944f, 134.0f, 66.3f),
                    PathNode.LineTo(134.0f, 38.2f),
                    PathNode.CurveTo(153.68768f, 39.50546f, 172.3946f, 47.270138f, 187.22f, 60.29f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 66.3f),
                    PathNode.CurveTo(109.74467f, 67.47944f, 98.12273f, 72.29957f, 88.63f, 80.14f),
                    PathNode.LineTo(68.78f, 60.29f),
                    PathNode.CurveTo(83.605385f, 47.270138f, 102.312325f, 39.50546f, 122.0f, 38.2f),
                    PathNode.Close,
                    PathNode.MoveTo(80.14f, 88.63f),
                    PathNode.CurveTo(72.29957f, 98.12273f, 67.47944f, 109.74467f, 66.3f, 122.0f),
                    PathNode.LineTo(38.2f, 122.0f),
                    PathNode.CurveTo(39.503246f, 102.311806f, 47.268208f, 83.60419f, 60.29f, 68.78f),
                    PathNode.Close,
                    PathNode.MoveTo(66.3f, 134.0f),
                    PathNode.CurveTo(67.47944f, 146.25534f, 72.29957f, 157.87727f, 80.14f, 167.37f),
                    PathNode.LineTo(60.29f, 187.22f),
                    PathNode.CurveTo(47.268208f, 172.39581f, 39.503246f, 153.6882f, 38.2f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.63f, 175.86f),
                    PathNode.CurveTo(98.12273f, 183.70044f, 109.74467f, 188.52055f, 122.0f, 189.7f),
                    PathNode.LineTo(122.0f, 217.8f),
                    PathNode.CurveTo(102.312325f, 216.49454f, 83.605385f, 208.72986f, 68.78f, 195.71f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 189.7f),
                    PathNode.CurveTo(146.25534f, 188.52055f, 157.87727f, 183.70044f, 167.37f, 175.86f),
                    PathNode.LineTo(187.22f, 195.71f),
                    PathNode.CurveTo(172.3946f, 208.72986f, 153.68768f, 216.49454f, 134.0f, 217.8f),
                    PathNode.Close,
                    PathNode.MoveTo(175.86f, 167.37f),
                    PathNode.CurveTo(183.70044f, 157.87727f, 188.52055f, 146.25534f, 189.7f, 134.0f),
                    PathNode.LineTo(217.8f, 134.0f),
                    PathNode.CurveTo(216.49675f, 153.6882f, 208.7318f, 172.39581f, 195.71f, 187.22f),
                    PathNode.Close,
                    PathNode.MoveTo(189.7f, 122.0f),
                    PathNode.CurveTo(188.52055f, 109.74467f, 183.70044f, 98.12273f, 175.86f, 88.63f),
                    PathNode.LineTo(195.71f, 68.78f),
                    PathNode.CurveTo(208.7318f, 83.60419f, 216.49675f, 102.311806f, 217.8f, 122.0f),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
