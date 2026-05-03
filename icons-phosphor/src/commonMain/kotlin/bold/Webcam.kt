package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorBoldIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 81.90861f, 150.09138f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(105.90861f, 64.0f, 88.0f, 81.90861f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 126.09139f, 105.90861f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(150.09138f, 144.0f, 168.0f, 126.09139f, 168.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 104.0f),
                    PathNode.CurveTo(112.0f, 95.163445f, 119.163445f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(136.83656f, 88.0f, 144.0f, 95.163445f, 144.0f, 104.0f),
                    PathNode.CurveTo(144.0f, 112.836555f, 136.83656f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(119.163445f, 120.0f, 112.0f, 112.836555f, 112.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 196.0f),
                    PathNode.LineTo(140.0f, 196.0f),
                    PathNode.LineTo(140.0f, 187.13f),
                    PathNode.CurveTo(183.60591f, 180.83603f, 214.93942f, 141.9208f, 211.78433f, 97.97612f),
                    PathNode.CurveTo(208.62924f, 54.03143f, 172.05782f, 19.991562f, 128.0f, 19.991562f),
                    PathNode.CurveTo(83.9422f, 19.991562f, 47.370754f, 54.03143f, 44.215668f, 97.97612f),
                    PathNode.CurveTo(41.06058f, 141.9208f, 72.39408f, 180.83603f, 116.0f, 187.13f),
                    PathNode.LineTo(116.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(25.372583f, 196.0f, 20.0f, 201.37259f, 20.0f, 208.0f),
                    PathNode.CurveTo(20.0f, 214.62741f, 25.372583f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(230.62741f, 220.0f, 236.0f, 214.62741f, 236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 201.37259f, 230.62741f, 196.0f, 224.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 104.0f),
                    PathNode.CurveTo(68.0f, 70.862915f, 94.862915f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(161.13708f, 44.0f, 188.0f, 70.862915f, 188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 137.13708f, 161.13708f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(94.87891f, 163.96143f, 68.038574f, 137.1211f, 68.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _webcam!!
    }

private var _webcam: ImageVector? = null
