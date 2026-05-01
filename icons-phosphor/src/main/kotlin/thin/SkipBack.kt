package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorThinIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.87f, 37.52f),
                    PathNode.CurveTo(194.05379f, 35.40427f, 189.38986f, 35.52681f, 185.69f, 37.84f),
                    PathNode.LineTo(60.0f, 116.44f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 37.79086f, 58.20914f, 36.0f, 56.0f, 36.0f),
                    PathNode.CurveTo(53.79086f, 36.0f, 52.0f, 37.79086f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 218.20914f, 53.79086f, 220.0f, 56.0f, 220.0f),
                    PathNode.CurveTo(58.20914f, 220.0f, 60.0f, 218.20914f, 60.0f, 216.0f),
                    PathNode.LineTo(60.0f, 139.56f),
                    PathNode.LineTo(185.69f, 218.16f),
                    PathNode.CurveTo(189.38986f, 220.47319f, 194.05379f, 220.59572f, 197.87f, 218.48f),
                    PathNode.CurveTo(201.67097f, 216.42497f, 204.02837f, 212.44084f, 204.0f, 208.12f),
                    PathNode.LineTo(204.0f, 47.88f),
                    PathNode.CurveTo(204.02837f, 43.55915f, 201.67097f, 39.575035f, 197.87f, 37.52f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 208.12f),
                    PathNode.CurveTo(196.00864f, 209.52696f, 195.23915f, 210.82355f, 194.0f, 211.49f),
                    PathNode.CurveTo(192.72733f, 212.19423f, 191.17267f, 212.15211f, 189.94f, 211.38f),
                    PathNode.LineTo(61.82f, 131.26f),
                    PathNode.CurveTo(60.689f, 130.56256f, 60.000298f, 129.32875f, 60.000298f, 128.0f),
                    PathNode.CurveTo(60.000298f, 126.67125f, 60.689f, 125.43744f, 61.82f, 124.74f),
                    PathNode.LineTo(189.94f, 44.62f),
                    PathNode.CurveTo(190.5716f, 44.22025f, 191.30255f, 44.005463f, 192.05f, 44.0f),
                    PathNode.CurveTo(192.73288f, 44.000763f, 193.40419f, 44.176334f, 194.0f, 44.51f),
                    PathNode.CurveTo(195.23915f, 45.176445f, 196.00864f, 46.473034f, 196.0f, 47.88f),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
