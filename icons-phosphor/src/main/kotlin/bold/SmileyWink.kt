package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorBoldIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 108.0f),
                    PathNode.CurveTo(76.0f, 99.163445f, 83.163445f, 92.0f, 92.0f, 92.0f),
                    PathNode.CurveTo(100.836555f, 92.0f, 108.0f, 99.163445f, 108.0f, 108.0f),
                    PathNode.CurveTo(108.0f, 116.836555f, 100.836555f, 124.0f, 92.0f, 124.0f),
                    PathNode.CurveTo(83.163445f, 124.0f, 76.0f, 116.836555f, 76.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 108.0f),
                    PathNode.CurveTo(188.0f, 114.62742f, 182.62741f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(145.37259f, 120.0f, 140.0f, 114.62742f, 140.0f, 108.0f),
                    PathNode.CurveTo(140.0f, 101.37258f, 145.37259f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(182.62741f, 96.0f, 188.0f, 101.37258f, 188.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.39f, 158.0f),
                    PathNode.CurveTo(167.39f, 177.06f, 149.0f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(107.0f, 188.0f, 88.64f, 177.07f, 77.61f, 158.0f),
                    PathNode.CurveTo(74.44228f, 152.27596f, 76.44314f, 145.0694f, 82.108444f, 141.7978f),
                    PathNode.CurveTo(87.773766f, 138.5262f, 95.015625f, 140.3953f, 98.39f, 146.0f),
                    PathNode.CurveTo(102.28f, 152.73f, 111.3f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(144.7f, 164.0f, 153.72f, 152.72f, 157.61f, 146.0f),
                    PathNode.CurveTo(159.71115f, 142.20326f, 163.69836f, 139.83665f, 168.03764f, 139.81068f),
                    PathNode.CurveTo(172.37692f, 139.78471f, 176.39218f, 142.10344f, 178.5386f, 145.87477f),
                    PathNode.CurveTo(180.68504f, 149.64607f, 180.62822f, 154.28241f, 178.39f, 158.0f),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
