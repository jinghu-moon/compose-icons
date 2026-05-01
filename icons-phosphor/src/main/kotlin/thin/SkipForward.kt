package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorThinIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.CurveTo(197.79086f, 36.0f, 196.0f, 37.79086f, 196.0f, 40.0f),
                    PathNode.LineTo(196.0f, 116.44f),
                    PathNode.LineTo(70.31f, 37.84f),
                    PathNode.CurveTo(66.61014f, 35.52681f, 61.94622f, 35.40427f, 58.13f, 37.52f),
                    PathNode.CurveTo(54.32903f, 39.575035f, 51.97163f, 43.55915f, 52.0f, 47.88f),
                    PathNode.LineTo(52.0f, 208.12f),
                    PathNode.CurveTo(51.97163f, 212.44084f, 54.32903f, 216.42497f, 58.13f, 218.48f),
                    PathNode.CurveTo(61.94622f, 220.59572f, 66.61014f, 220.47319f, 70.31f, 218.16f),
                    PathNode.LineTo(196.0f, 139.56f),
                    PathNode.LineTo(196.0f, 216.0f),
                    PathNode.CurveTo(196.0f, 218.20914f, 197.79086f, 220.0f, 200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 218.20914f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 37.79086f, 202.20914f, 36.0f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.18f, 131.26f),
                    PathNode.LineTo(66.06f, 211.38f),
                    PathNode.CurveTo(64.827324f, 212.15211f, 63.272675f, 212.19423f, 62.0f, 211.49f),
                    PathNode.CurveTo(60.760853f, 210.82355f, 59.991364f, 209.52696f, 60.0f, 208.12f),
                    PathNode.LineTo(60.0f, 47.88f),
                    PathNode.CurveTo(59.991364f, 46.473034f, 60.760853f, 45.176445f, 62.0f, 44.51f),
                    PathNode.CurveTo(62.610573f, 44.167965f, 63.300198f, 43.99211f, 64.0f, 44.0f),
                    PathNode.CurveTo(64.747444f, 44.005463f, 65.47841f, 44.22025f, 66.11f, 44.62f),
                    PathNode.LineTo(194.23f, 124.74f),
                    PathNode.CurveTo(195.36101f, 125.43744f, 196.0497f, 126.67125f, 196.0497f, 128.0f),
                    PathNode.CurveTo(196.0497f, 129.32875f, 195.36101f, 130.56256f, 194.23f, 131.26f),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
