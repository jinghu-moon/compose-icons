package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorFillIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.4f, 44.34f),
                    PathNode.CurveTo(231.4f, 44.34f, 231.4f, 44.44f, 231.4f, 44.49f),
                    PathNode.LineTo(173.2f, 236.43f),
                    PathNode.CurveTo(171.3959f, 242.8145f, 165.81285f, 247.40456f, 159.2f, 247.94f),
                    PathNode.QuadTo(158.51f, 248.0f, 157.82f, 248.0f),
                    PathNode.CurveTo(151.64137f, 248.01921f, 146.01402f, 244.44844f, 143.4f, 238.85f),
                    PathNode.LineTo(107.0f, 164.15f),
                    PathNode.CurveTo(106.25336f, 162.61539f, 106.562584f, 160.7761f, 107.77f, 159.57f),
                    PathNode.LineTo(165.69f, 101.65f),
                    PathNode.CurveTo(168.67824f, 98.504684f, 168.6148f, 93.55075f, 165.54703f, 90.48297f),
                    PathNode.CurveTo(162.47925f, 87.41519f, 157.52531f, 87.35177f, 154.38f, 90.34f),
                    PathNode.LineTo(96.43f, 148.26f),
                    PathNode.CurveTo(95.223915f, 149.46742f, 93.384605f, 149.77664f, 91.85f, 149.03f),
                    PathNode.LineTo(17.08f, 112.64f),
                    PathNode.CurveTo(11.094077f, 109.76822f, 7.503573f, 103.498085f, 8.056395f, 96.88199f),
                    PathNode.CurveTo(8.609216f, 90.265884f, 13.190495f, 84.67856f, 19.57f, 82.84f),
                    PathNode.LineTo(211.51f, 24.64f),
                    PathNode.LineTo(211.66f, 24.64f),
                    PathNode.CurveTo(217.22418f, 23.076752f, 223.19891f, 24.635798f, 227.28986f, 28.718447f),
                    PathNode.CurveTo(231.3808f, 32.801094f, 232.95197f, 38.772663f, 231.4f, 44.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
