package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorLightIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 66.0f),
                    PathNode.CurveTo(37.758347f, 66.0f, 10.0f, 93.75835f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 162.24165f, 37.758347f, 190.0f, 72.0f, 190.0f),
                    PathNode.CurveTo(106.24165f, 190.0f, 134.0f, 162.24165f, 134.0f, 128.0f),
                    PathNode.CurveTo(133.96143f, 93.77434f, 106.22566f, 66.038574f, 72.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 178.0f),
                    PathNode.CurveTo(44.38576f, 178.0f, 22.0f, 155.61424f, 22.0f, 128.0f),
                    PathNode.CurveTo(22.0f, 100.385765f, 44.38576f, 78.0f, 72.0f, 78.0f),
                    PathNode.CurveTo(99.614235f, 78.0f, 122.0f, 100.385765f, 122.0f, 128.0f),
                    PathNode.CurveTo(121.96694f, 155.60052f, 99.60053f, 177.96693f, 72.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 66.0f),
                    PathNode.CurveTo(166.9f, 66.0f, 154.0f, 92.65f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 163.35f, 166.9f, 190.0f, 184.0f, 190.0f),
                    PathNode.CurveTo(201.1f, 190.0f, 214.0f, 163.35f, 214.0f, 128.0f),
                    PathNode.CurveTo(214.0f, 92.65f, 201.1f, 66.0f, 184.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 178.0f),
                    PathNode.CurveTo(176.66f, 178.0f, 166.0f, 158.52f, 166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 97.48f, 176.66f, 78.0f, 184.0f, 78.0f),
                    PathNode.CurveTo(191.34f, 78.0f, 202.0f, 97.48f, 202.0f, 128.0f),
                    PathNode.CurveTo(202.0f, 158.52f, 191.34f, 178.0f, 184.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 72.0f),
                    PathNode.LineTo(246.0f, 184.0f),
                    PathNode.CurveTo(246.0f, 187.3137f, 243.3137f, 190.0f, 240.0f, 190.0f),
                    PathNode.CurveTo(236.6863f, 190.0f, 234.0f, 187.3137f, 234.0f, 184.0f),
                    PathNode.LineTo(234.0f, 72.0f),
                    PathNode.CurveTo(234.0f, 68.686295f, 236.6863f, 66.0f, 240.0f, 66.0f),
                    PathNode.CurveTo(243.3137f, 66.0f, 246.0f, 68.686295f, 246.0f, 72.0f),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
