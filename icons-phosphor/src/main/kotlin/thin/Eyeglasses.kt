package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorThinIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 44.0f),
                    PathNode.CurveTo(197.79086f, 44.0f, 196.0f, 45.79086f, 196.0f, 48.0f),
                    PathNode.CurveTo(196.0f, 50.20914f, 197.79086f, 52.0f, 200.0f, 52.0f),
                    PathNode.CurveTo(211.0457f, 52.0f, 220.0f, 60.954304f, 220.0f, 72.0f),
                    PathNode.LineTo(220.0f, 140.0f),
                    PathNode.CurveTo(210.55331f, 127.3974f, 194.5904f, 121.511475f, 179.22353f, 124.96471f),
                    PathNode.CurveTo(163.85666f, 128.41794f, 151.94666f, 140.56743f, 148.8f, 156.0f),
                    PathNode.LineTo(107.2f, 156.0f),
                    PathNode.CurveTo(104.05335f, 140.56743f, 92.14334f, 128.41794f, 76.776474f, 124.96471f),
                    PathNode.CurveTo(61.409603f, 121.511475f, 45.446686f, 127.3974f, 36.0f, 140.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 60.954304f, 44.954304f, 52.0f, 56.0f, 52.0f),
                    PathNode.CurveTo(58.20914f, 52.0f, 60.0f, 50.20914f, 60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 45.79086f, 58.20914f, 44.0f, 56.0f, 44.0f),
                    PathNode.CurveTo(40.53603f, 44.0f, 28.0f, 56.53603f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 164.0f),
                    PathNode.CurveTo(28.0f, 186.09138f, 45.90861f, 204.0f, 68.0f, 204.0f),
                    PathNode.CurveTo(90.09139f, 204.0f, 108.0f, 186.09138f, 108.0f, 164.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.CurveTo(148.0f, 186.09138f, 165.90862f, 204.0f, 188.0f, 204.0f),
                    PathNode.CurveTo(210.09138f, 204.0f, 228.0f, 186.09138f, 228.0f, 164.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(228.0f, 56.53603f, 215.46397f, 44.0f, 200.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 196.0f),
                    PathNode.CurveTo(50.32689f, 196.0f, 36.0f, 181.67311f, 36.0f, 164.0f),
                    PathNode.CurveTo(36.0f, 146.32689f, 50.32689f, 132.0f, 68.0f, 132.0f),
                    PathNode.CurveTo(85.67311f, 132.0f, 100.0f, 146.32689f, 100.0f, 164.0f),
                    PathNode.CurveTo(100.0f, 181.67311f, 85.67311f, 196.0f, 68.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 196.0f),
                    PathNode.CurveTo(170.32689f, 196.0f, 156.0f, 181.67311f, 156.0f, 164.0f),
                    PathNode.CurveTo(156.0f, 146.32689f, 170.32689f, 132.0f, 188.0f, 132.0f),
                    PathNode.CurveTo(205.67311f, 132.0f, 220.0f, 146.32689f, 220.0f, 164.0f),
                    PathNode.CurveTo(220.0f, 181.67311f, 205.67311f, 196.0f, 188.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
