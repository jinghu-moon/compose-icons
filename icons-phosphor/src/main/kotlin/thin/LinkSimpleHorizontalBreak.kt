package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorThinIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 128.0f),
                    PathNode.CurveTo(20.027554f, 152.28911f, 39.71089f, 171.97244f, 64.0f, 172.0f),
                    PathNode.LineTo(104.0f, 172.0f),
                    PathNode.CurveTo(106.20914f, 172.0f, 108.0f, 173.79086f, 108.0f, 176.0f),
                    PathNode.CurveTo(108.0f, 178.20914f, 106.20914f, 180.0f, 104.0f, 180.0f),
                    PathNode.LineTo(64.0f, 180.0f),
                    PathNode.CurveTo(35.281193f, 180.0f, 12.0f, 156.71881f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 99.2812f, 35.281193f, 76.0f, 64.0f, 76.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(106.20914f, 76.0f, 108.0f, 77.79086f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 82.20914f, 106.20914f, 84.0f, 104.0f, 84.0f),
                    PathNode.LineTo(64.0f, 84.0f),
                    PathNode.CurveTo(39.71089f, 84.02756f, 20.027554f, 103.71089f, 20.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(149.79086f, 76.0f, 148.0f, 77.79086f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 82.20914f, 149.79086f, 84.0f, 152.0f, 84.0f),
                    PathNode.LineTo(192.0f, 84.0f),
                    PathNode.CurveTo(216.30052f, 84.0f, 236.0f, 103.69947f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 152.30052f, 216.30052f, 172.0f, 192.0f, 172.0f),
                    PathNode.LineTo(152.0f, 172.0f),
                    PathNode.CurveTo(149.79086f, 172.0f, 148.0f, 173.79086f, 148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 178.20914f, 149.79086f, 180.0f, 152.0f, 180.0f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.CurveTo(220.71881f, 180.0f, 244.0f, 156.71881f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 99.2812f, 220.71881f, 76.0f, 192.0f, 76.0f),
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
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
