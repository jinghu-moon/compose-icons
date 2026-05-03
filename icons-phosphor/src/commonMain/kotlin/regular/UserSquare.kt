package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorRegularIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 102.32689f, 110.32689f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(145.67311f, 88.0f, 160.0f, 102.32689f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 137.67311f, 145.67311f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(110.32689f, 152.0f, 96.0f, 137.67311f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.67f, 208.0f),
                    PathNode.CurveTo(72.763824f, 197.92151f, 79.34543f, 189.04512f, 87.8f, 182.2f),
                    PathNode.CurveTo(111.25568f, 163.2656f, 144.74432f, 163.2656f, 168.2f, 182.2f),
                    PathNode.CurveTo(176.65457f, 189.04512f, 183.23618f, 197.92151f, 187.33f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(204.33f, 208.0f),
                    PathNode.CurveTo(197.1264f, 185.06866f, 179.98224f, 166.59866f, 157.65f, 157.71f),
                    PathNode.CurveTo(173.74275f, 145.06944f, 180.05199f, 123.61626f, 173.36453f, 104.27619f),
                    PathNode.CurveTo(166.67708f, 84.93612f, 148.46364f, 71.96245f, 128.0f, 71.96245f),
                    PathNode.CurveTo(107.53637f, 71.96245f, 89.32292f, 84.93612f, 82.63545f, 104.27619f),
                    PathNode.CurveTo(75.948006f, 123.61626f, 82.25725f, 145.06944f, 98.35f, 157.71f),
                    PathNode.CurveTo(76.01775f, 166.59866f, 58.873596f, 185.06866f, 51.67f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
