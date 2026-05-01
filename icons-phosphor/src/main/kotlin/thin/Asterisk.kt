package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorThinIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.43f, 178.06f),
                    PathNode.CurveTo(210.88385f, 178.96991f, 209.9985f, 179.6255f, 208.96884f, 179.88245f),
                    PathNode.CurveTo(207.93918f, 180.13939f, 206.84962f, 179.97664f, 205.94f, 179.43f),
                    PathNode.LineTo(132.0f, 135.06f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(125.79086f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 135.06f),
                    PathNode.LineTo(50.06f, 179.43f),
                    PathNode.CurveTo(48.165665f, 180.5677f, 45.707706f, 179.95433f, 44.57f, 178.06f),
                    PathNode.CurveTo(43.432293f, 176.16566f, 44.04566f, 173.7077f, 45.94f, 172.57f),
                    PathNode.LineTo(120.22f, 128.0f),
                    PathNode.LineTo(45.94f, 83.43f),
                    PathNode.CurveTo(44.04566f, 82.29229f, 43.432293f, 79.834335f, 44.57f, 77.94f),
                    PathNode.CurveTo(45.707706f, 76.04566f, 48.165665f, 75.4323f, 50.06f, 76.57f),
                    PathNode.LineTo(124.0f, 120.94f),
                    PathNode.LineTo(124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 37.79086f, 125.79086f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(130.20914f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.LineTo(132.0f, 120.94f),
                    PathNode.LineTo(205.94f, 76.57f),
                    PathNode.CurveTo(207.83434f, 75.4323f, 210.2923f, 76.04566f, 211.43f, 77.94f),
                    PathNode.CurveTo(212.5677f, 79.834335f, 211.95433f, 82.29229f, 210.06f, 83.43f),
                    PathNode.LineTo(135.78f, 128.0f),
                    PathNode.LineTo(210.06f, 172.57f),
                    PathNode.CurveTo(210.96991f, 173.11615f, 211.6255f, 174.0015f, 211.88245f, 175.03116f),
                    PathNode.CurveTo(212.13939f, 176.06082f, 211.97664f, 177.15038f, 211.43f, 178.06f),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
