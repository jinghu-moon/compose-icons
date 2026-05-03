package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorBoldIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 76.0f),
                    PathNode.CurveTo(176.0f, 49.490334f, 154.50967f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(101.49033f, 28.0f, 80.0f, 49.490334f, 80.0f, 76.0f),
                    PathNode.CurveTo(80.0f, 102.50967f, 101.49033f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(154.49825f, 123.97244f, 175.97244f, 102.498245f, 176.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(114.74516f, 100.0f, 104.0f, 89.25484f, 104.0f, 76.0f),
                    PathNode.CurveTo(104.0f, 62.745167f, 114.74516f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(141.25484f, 52.0f, 152.0f, 62.745167f, 152.0f, 76.0f),
                    PathNode.CurveTo(152.0f, 89.25484f, 141.25484f, 100.0f, 128.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 124.0f),
                    PathNode.CurveTo(161.49033f, 124.0f, 140.0f, 145.49033f, 140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 198.50967f, 161.49033f, 220.0f, 188.0f, 220.0f),
                    PathNode.CurveTo(214.50967f, 220.0f, 236.0f, 198.50967f, 236.0f, 172.0f),
                    PathNode.CurveTo(235.97244f, 145.50175f, 214.49825f, 124.02756f, 188.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 196.0f),
                    PathNode.CurveTo(174.74516f, 196.0f, 164.0f, 185.25484f, 164.0f, 172.0f),
                    PathNode.CurveTo(164.0f, 158.74516f, 174.74516f, 148.0f, 188.0f, 148.0f),
                    PathNode.CurveTo(201.25484f, 148.0f, 212.0f, 158.74516f, 212.0f, 172.0f),
                    PathNode.CurveTo(212.0f, 185.25484f, 201.25484f, 196.0f, 188.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 124.0f),
                    PathNode.CurveTo(41.490334f, 124.0f, 20.0f, 145.49033f, 20.0f, 172.0f),
                    PathNode.CurveTo(20.0f, 198.50967f, 41.490334f, 220.0f, 68.0f, 220.0f),
                    PathNode.CurveTo(94.50967f, 220.0f, 116.0f, 198.50967f, 116.0f, 172.0f),
                    PathNode.CurveTo(115.97244f, 145.50175f, 94.498245f, 124.02756f, 68.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 196.0f),
                    PathNode.CurveTo(54.745167f, 196.0f, 44.0f, 185.25484f, 44.0f, 172.0f),
                    PathNode.CurveTo(44.0f, 158.74516f, 54.745167f, 148.0f, 68.0f, 148.0f),
                    PathNode.CurveTo(81.25484f, 148.0f, 92.0f, 158.74516f, 92.0f, 172.0f),
                    PathNode.CurveTo(92.0f, 185.25484f, 81.25484f, 196.0f, 68.0f, 196.0f),
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
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
