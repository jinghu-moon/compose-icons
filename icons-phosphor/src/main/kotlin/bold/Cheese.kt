package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorBoldIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 28.0f),
                    PathNode.CurveTo(182.83115f, 27.999065f, 181.66858f, 28.170923f, 180.55f, 28.51f),
                    PathNode.LineTo(20.55f, 76.51f),
                    PathNode.LineTo(20.55f, 76.51f),
                    PathNode.CurveTo(15.476302f, 78.03299f, 12.001487f, 82.702644f, 12.0f, 88.0f),
                    PathNode.LineTo(12.0f, 112.0f),
                    PathNode.CurveTo(12.0f, 118.62742f, 17.372583f, 124.0f, 24.0f, 124.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(38.51966f, 124.03566f, 43.832645f, 129.24239f, 44.0f, 135.76f),
                    PathNode.CurveTo(44.039112f, 138.90265f, 42.801357f, 141.92667f, 40.57f, 144.14f),
                    PathNode.CurveTo(38.168335f, 146.58821f, 34.88946f, 147.9775f, 31.46f, 148.0f),
                    PathNode.LineTo(24.0f, 148.0f),
                    PathNode.CurveTo(17.372583f, 148.0f, 12.0f, 153.37259f, 12.0f, 160.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 198.62741f, 17.372583f, 204.0f, 24.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(235.0457f, 204.0f, 244.0f, 195.0457f, 244.0f, 184.0f),
                    PathNode.LineTo(244.0f, 88.0f),
                    PathNode.CurveTo(243.96143f, 54.878906f, 217.1211f, 28.038574f, 184.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(185.64f, 52.0f),
                    PathNode.CurveTo(200.28435f, 52.690216f, 213.05313f, 62.177845f, 217.94f, 76.0f),
                    PathNode.LineTo(105.76f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 100.0f),
                    PathNode.LineTo(184.0f, 100.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 112.836555f, 176.83656f, 120.0f, 168.0f, 120.0f),
                    PathNode.CurveTo(159.16344f, 120.0f, 152.0f, 112.836555f, 152.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 180.0f),
                    PathNode.CurveTo(96.0f, 171.16344f, 103.163445f, 164.0f, 112.0f, 164.0f),
                    PathNode.CurveTo(120.836555f, 164.0f, 128.0f, 171.16344f, 128.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 180.0f),
                    PathNode.LineTo(152.0f, 180.0f),
                    PathNode.CurveTo(152.0f, 157.90862f, 134.09138f, 140.0f, 112.0f, 140.0f),
                    PathNode.CurveTo(89.90861f, 140.0f, 72.0f, 157.90862f, 72.0f, 180.0f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(36.0f, 171.71f),
                    PathNode.CurveTo(44.227276f, 170.66641f, 51.867447f, 166.89563f, 57.7f, 161.0f),
                    PathNode.CurveTo(64.47844f, 154.18999f, 68.196495f, 144.91649f, 68.0f, 135.31f),
                    PathNode.CurveTo(67.563736f, 117.27505f, 53.918495f, 102.312195f, 36.0f, 100.22f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(128.0f, 100.0f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.CurveTo(128.0f, 126.09139f, 145.90862f, 144.0f, 168.0f, 144.0f),
                    PathNode.CurveTo(190.09138f, 144.0f, 208.0f, 126.09139f, 208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 100.0f),
                    PathNode.LineTo(220.0f, 100.0f),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
