package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorLightIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(46.0f, 46.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.LineTo(64.0f, 210.0f),
                    PathNode.CurveTo(67.313705f, 210.0f, 70.0f, 212.6863f, 70.0f, 216.0f),
                    PathNode.CurveTo(70.0f, 219.3137f, 67.313705f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(40.0f, 222.0f),
                    PathNode.CurveTo(36.68629f, 222.0f, 34.0f, 219.3137f, 34.0f, 216.0f),
                    PathNode.LineTo(34.0f, 40.0f),
                    PathNode.CurveTo(34.0f, 36.68629f, 36.68629f, 34.0f, 40.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(67.313705f, 34.0f, 70.0f, 36.68629f, 70.0f, 40.0f),
                    PathNode.CurveTo(70.0f, 43.31371f, 67.313705f, 46.0f, 64.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 34.0f),
                    PathNode.LineTo(192.0f, 34.0f),
                    PathNode.CurveTo(188.6863f, 34.0f, 186.0f, 36.68629f, 186.0f, 40.0f),
                    PathNode.CurveTo(186.0f, 43.31371f, 188.6863f, 46.0f, 192.0f, 46.0f),
                    PathNode.LineTo(210.0f, 46.0f),
                    PathNode.LineTo(210.0f, 210.0f),
                    PathNode.LineTo(192.0f, 210.0f),
                    PathNode.CurveTo(188.6863f, 210.0f, 186.0f, 212.6863f, 186.0f, 216.0f),
                    PathNode.CurveTo(186.0f, 219.3137f, 188.6863f, 222.0f, 192.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 36.68629f, 219.3137f, 34.0f, 216.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 90.0f),
                    PathNode.CurveTo(142.55728f, 90.0f, 133.66563f, 94.44582f, 128.0f, 102.0f),
                    PathNode.CurveTo(118.05888f, 88.74516f, 99.25484f, 86.05888f, 86.0f, 96.0f),
                    PathNode.LineTo(86.0f, 96.0f),
                    PathNode.CurveTo(86.0f, 92.686295f, 83.313705f, 90.0f, 80.0f, 90.0f),
                    PathNode.CurveTo(76.686295f, 90.0f, 74.0f, 92.686295f, 74.0f, 96.0f),
                    PathNode.LineTo(74.0f, 160.0f),
                    PathNode.CurveTo(74.0f, 163.3137f, 76.686295f, 166.0f, 80.0f, 166.0f),
                    PathNode.CurveTo(83.313705f, 166.0f, 86.0f, 163.3137f, 86.0f, 160.0f),
                    PathNode.LineTo(86.0f, 120.0f),
                    PathNode.CurveTo(86.0f, 110.05888f, 94.05888f, 102.0f, 104.0f, 102.0f),
                    PathNode.CurveTo(113.94112f, 102.0f, 122.0f, 110.05888f, 122.0f, 120.0f),
                    PathNode.LineTo(122.0f, 160.0f),
                    PathNode.CurveTo(122.0f, 163.3137f, 124.686295f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(131.3137f, 166.0f, 134.0f, 163.3137f, 134.0f, 160.0f),
                    PathNode.LineTo(134.0f, 120.0f),
                    PathNode.CurveTo(134.0f, 110.05888f, 142.05887f, 102.0f, 152.0f, 102.0f),
                    PathNode.CurveTo(161.94113f, 102.0f, 170.0f, 110.05888f, 170.0f, 120.0f),
                    PathNode.LineTo(170.0f, 160.0f),
                    PathNode.CurveTo(170.0f, 163.3137f, 172.6863f, 166.0f, 176.0f, 166.0f),
                    PathNode.CurveTo(179.3137f, 166.0f, 182.0f, 163.3137f, 182.0f, 160.0f),
                    PathNode.LineTo(182.0f, 120.0f),
                    PathNode.CurveTo(182.0f, 103.43146f, 168.56854f, 90.0f, 152.0f, 90.0f),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
