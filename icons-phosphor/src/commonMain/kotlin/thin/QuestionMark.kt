package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorThinIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 96.0f),
                    PathNode.CurveTo(188.0f, 123.51f, 163.23f, 146.09f, 132.0f, 147.89f),
                    PathNode.LineTo(132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 162.20914f, 130.20914f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(125.79086f, 164.0f, 124.0f, 162.20914f, 124.0f, 160.0f),
                    PathNode.LineTo(124.0f, 144.0f),
                    PathNode.CurveTo(124.0f, 141.79086f, 125.79086f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(156.67f, 140.0f, 180.0f, 120.26f, 180.0f, 96.0f),
                    PathNode.CurveTo(180.0f, 71.74f, 156.67f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(99.33f, 52.0f, 76.0f, 71.74f, 76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 98.20914f, 74.20914f, 100.0f, 72.0f, 100.0f),
                    PathNode.CurveTo(69.79086f, 100.0f, 68.0f, 98.20914f, 68.0f, 96.0f),
                    PathNode.CurveTo(68.0f, 67.33f, 94.92f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(161.08f, 44.0f, 188.0f, 67.33f, 188.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(121.37258f, 196.0f, 116.0f, 201.37259f, 116.0f, 208.0f),
                    PathNode.CurveTo(116.0f, 214.62741f, 121.37258f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(134.62741f, 220.0f, 140.0f, 214.62741f, 140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 201.37259f, 134.62741f, 196.0f, 128.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
