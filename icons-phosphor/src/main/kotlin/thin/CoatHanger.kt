package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorThinIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.18f, 174.4f),
                    PathNode.LineTo(134.67f, 96.0f),
                    PathNode.LineTo(162.39f, 75.2f),
                    PathNode.CurveTo(163.40099f, 74.44668f, 163.99763f, 73.26078f, 164.0f, 72.0f),
                    PathNode.CurveTo(164.0f, 52.11775f, 147.88223f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(108.11775f, 36.0f, 92.0f, 52.11775f, 92.0f, 72.0f),
                    PathNode.CurveTo(92.0f, 74.20914f, 93.79086f, 76.0f, 96.0f, 76.0f),
                    PathNode.CurveTo(98.20914f, 76.0f, 100.0f, 74.20914f, 100.0f, 72.0f),
                    PathNode.CurveTo(100.06019f, 56.96908f, 111.977554f, 44.667263f, 126.998985f, 44.130013f),
                    PathNode.CurveTo(142.02042f, 43.592766f, 154.78616f, 55.011787f, 155.92f, 70.0f),
                    PathNode.LineTo(125.66f, 92.7f),
                    PathNode.LineTo(125.52f, 92.8f),
                    PathNode.LineTo(16.82f, 174.4f),
                    PathNode.CurveTo(12.690798f, 177.49689f, 11.004494f, 182.88728f, 12.632619f, 187.78526f),
                    PathNode.CurveTo(14.260744f, 192.68324f, 18.838514f, 195.99141f, 24.0f, 196.0f),
                    PathNode.LineTo(232.0f, 196.0f),
                    PathNode.CurveTo(237.16516f, 196.0f, 241.75081f, 192.69484f, 243.3842f, 187.79474f),
                    PathNode.CurveTo(245.01756f, 182.89462f, 243.33214f, 177.4991f, 239.2f, 174.4f),
                    PathNode.Close,
                    PathNode.MoveTo(235.77f, 185.27f),
                    PathNode.CurveTo(235.25931f, 186.91644f, 233.72359f, 188.02852f, 232.0f, 188.0f),
                    PathNode.LineTo(24.0f, 188.0f),
                    PathNode.CurveTo(22.278278f, 188.0f, 20.749723f, 186.89828f, 20.205267f, 185.26491f),
                    PathNode.CurveTo(19.66081f, 183.63155f, 20.222622f, 181.83304f, 21.6f, 180.8f),
                    PathNode.LineTo(128.0f, 101.0f),
                    PathNode.LineTo(234.38f, 180.8f),
                    PathNode.CurveTo(235.7912f, 181.81122f, 236.3589f, 183.63683f, 235.77f, 185.27f),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
