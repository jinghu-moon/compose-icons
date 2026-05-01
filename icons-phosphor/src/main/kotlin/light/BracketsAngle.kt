package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorLightIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(85.06f, 43.22f),
                    PathNode.LineTo(31.11f, 128.0f),
                    PathNode.LineTo(85.11f, 212.78f),
                    PathNode.CurveTo(86.886986f, 215.5748f, 86.063416f, 219.28084f, 83.27f, 221.06f),
                    PathNode.CurveTo(80.4752f, 222.83699f, 76.76916f, 222.01341f, 74.99f, 219.22f),
                    PathNode.LineTo(18.99f, 131.22f),
                    PathNode.CurveTo(17.740355f, 129.2552f, 17.740355f, 126.744804f, 18.99f, 124.78f),
                    PathNode.LineTo(74.99f, 36.78f),
                    PathNode.CurveTo(76.809814f, 34.08904f, 80.44075f, 33.33514f, 83.18142f, 35.0792f),
                    PathNode.CurveTo(85.92208f, 36.823265f, 86.77695f, 40.43176f, 85.11f, 43.22f),
                    PathNode.Close,
                    PathNode.MoveTo(237.06f, 124.78f),
                    PathNode.LineTo(181.06f, 36.78f),
                    PathNode.CurveTo(179.93954f, 34.905888f, 177.88947f, 33.788403f, 175.7072f, 33.862263f),
                    PathNode.CurveTo(173.52495f, 33.936123f, 171.5551f, 35.189667f, 170.56393f, 37.135254f),
                    PathNode.CurveTo(169.57278f, 39.080833f, 169.71681f, 41.41127f, 170.94f, 43.22f),
                    PathNode.LineTo(224.89f, 128.0f),
                    PathNode.LineTo(170.94f, 212.78f),
                    PathNode.CurveTo(169.16301f, 215.5748f, 169.98659f, 219.28084f, 172.78f, 221.06f),
                    PathNode.CurveTo(175.5748f, 222.83699f, 179.28084f, 222.01341f, 181.06f, 219.22f),
                    PathNode.LineTo(237.06f, 131.22f),
                    PathNode.CurveTo(238.30965f, 129.2552f, 238.30965f, 126.744804f, 237.06f, 124.78f),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
