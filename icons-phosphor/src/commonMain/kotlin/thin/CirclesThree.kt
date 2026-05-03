package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorThinIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 76.0f),
                    PathNode.CurveTo(168.0f, 53.90861f, 150.09138f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(105.90861f, 36.0f, 88.0f, 53.90861f, 88.0f, 76.0f),
                    PathNode.CurveTo(88.0f, 98.09139f, 105.90861f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(150.09138f, 116.0f, 168.0f, 98.09139f, 168.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(110.32689f, 108.0f, 96.0f, 93.67311f, 96.0f, 76.0f),
                    PathNode.CurveTo(96.0f, 58.32689f, 110.32689f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(145.67311f, 44.0f, 160.0f, 58.32689f, 160.0f, 76.0f),
                    PathNode.CurveTo(160.0f, 93.67311f, 145.67311f, 108.0f, 128.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 132.0f),
                    PathNode.CurveTo(165.90862f, 132.0f, 148.0f, 149.90862f, 148.0f, 172.0f),
                    PathNode.CurveTo(148.0f, 194.09138f, 165.90862f, 212.0f, 188.0f, 212.0f),
                    PathNode.CurveTo(210.09138f, 212.0f, 228.0f, 194.09138f, 228.0f, 172.0f),
                    PathNode.CurveTo(228.0f, 149.90862f, 210.09138f, 132.0f, 188.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 204.0f),
                    PathNode.CurveTo(170.32689f, 204.0f, 156.0f, 189.67311f, 156.0f, 172.0f),
                    PathNode.CurveTo(156.0f, 154.32689f, 170.32689f, 140.0f, 188.0f, 140.0f),
                    PathNode.CurveTo(205.67311f, 140.0f, 220.0f, 154.32689f, 220.0f, 172.0f),
                    PathNode.CurveTo(220.0f, 189.67311f, 205.67311f, 204.0f, 188.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 132.0f),
                    PathNode.CurveTo(45.90861f, 132.0f, 28.0f, 149.90862f, 28.0f, 172.0f),
                    PathNode.CurveTo(28.0f, 194.09138f, 45.90861f, 212.0f, 68.0f, 212.0f),
                    PathNode.CurveTo(90.09139f, 212.0f, 108.0f, 194.09138f, 108.0f, 172.0f),
                    PathNode.CurveTo(108.0f, 149.90862f, 90.09139f, 132.0f, 68.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 204.0f),
                    PathNode.CurveTo(50.32689f, 204.0f, 36.0f, 189.67311f, 36.0f, 172.0f),
                    PathNode.CurveTo(36.0f, 154.32689f, 50.32689f, 140.0f, 68.0f, 140.0f),
                    PathNode.CurveTo(85.67311f, 140.0f, 100.0f, 154.32689f, 100.0f, 172.0f),
                    PathNode.CurveTo(100.0f, 189.67311f, 85.67311f, 204.0f, 68.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
