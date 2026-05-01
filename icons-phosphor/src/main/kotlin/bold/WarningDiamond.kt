package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorBoldIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 138.62741f, 134.62741f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(121.37258f, 144.0f, 116.0f, 138.62741f, 116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(119.163445f, 156.0f, 112.0f, 163.16344f, 112.0f, 172.0f),
                    PathNode.CurveTo(112.0f, 180.83656f, 119.163445f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(136.83656f, 188.0f, 144.0f, 180.83656f, 144.0f, 172.0f),
                    PathNode.CurveTo(144.0f, 163.16344f, 136.83656f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.01166f, 133.29369f, 241.90938f, 138.37297f, 238.16f, 142.11f),
                    PathNode.LineTo(142.16f, 238.17f),
                    PathNode.CurveTo(134.35808f, 245.9311f, 121.751915f, 245.9311f, 113.95f, 238.17f),
                    PathNode.LineTo(113.95f, 238.17f),
                    PathNode.LineTo(17.95f, 142.11f),
                    PathNode.CurveTo(10.182264f, 134.30692f, 10.182264f, 121.69308f, 17.95f, 113.89f),
                    PathNode.LineTo(114.0f, 17.83f),
                    PathNode.CurveTo(121.80192f, 10.068898f, 134.40808f, 10.068898f, 142.21f, 17.83f),
                    PathNode.LineTo(238.27f, 113.89f),
                    PathNode.CurveTo(241.97906f, 117.645065f, 244.04083f, 122.722115f, 244.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.32f, 128.0f),
                    PathNode.LineTo(128.0f, 37.67f),
                    PathNode.LineTo(37.68f, 128.0f),
                    PathNode.LineTo(128.0f, 218.33f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
