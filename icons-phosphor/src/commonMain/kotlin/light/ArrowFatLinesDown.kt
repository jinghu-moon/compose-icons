package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorLightIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.54f, 133.7f),
                    PathNode.CurveTo(228.61055f, 131.46059f, 226.42464f, 130.00067f, 224.0f, 130.0f),
                    PathNode.LineTo(182.0f, 130.0f),
                    PathNode.LineTo(182.0f, 104.0f),
                    PathNode.CurveTo(182.0f, 100.686295f, 179.3137f, 98.0f, 176.0f, 98.0f),
                    PathNode.LineTo(80.0f, 98.0f),
                    PathNode.CurveTo(76.686295f, 98.0f, 74.0f, 100.686295f, 74.0f, 104.0f),
                    PathNode.LineTo(74.0f, 130.0f),
                    PathNode.LineTo(32.0f, 130.0f),
                    PathNode.CurveTo(29.574867f, 130.00214f, 27.389475f, 131.46396f, 26.461704f, 133.7046f),
                    PathNode.CurveTo(25.533934f, 135.94527f, 26.046238f, 138.52411f, 27.76f, 140.24f),
                    PathNode.LineTo(123.76f, 236.24f),
                    PathNode.CurveTo(126.10254f, 238.57962f, 129.89746f, 238.57962f, 132.24f, 236.24f),
                    PathNode.LineTo(228.24f, 140.24f),
                    PathNode.CurveTo(229.9563f, 138.52364f, 230.46942f, 135.94228f, 229.54f, 133.7f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 223.51f),
                    PathNode.LineTo(46.49f, 142.0f),
                    PathNode.LineTo(80.0f, 142.0f),
                    PathNode.CurveTo(83.313705f, 142.0f, 86.0f, 139.3137f, 86.0f, 136.0f),
                    PathNode.LineTo(86.0f, 110.0f),
                    PathNode.LineTo(170.0f, 110.0f),
                    PathNode.LineTo(170.0f, 136.0f),
                    PathNode.CurveTo(170.0f, 139.3137f, 172.6863f, 142.0f, 176.0f, 142.0f),
                    PathNode.LineTo(209.51f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 40.0f),
                    PathNode.CurveTo(74.0f, 36.68629f, 76.686295f, 34.0f, 80.0f, 34.0f),
                    PathNode.LineTo(176.0f, 34.0f),
                    PathNode.CurveTo(179.3137f, 34.0f, 182.0f, 36.68629f, 182.0f, 40.0f),
                    PathNode.CurveTo(182.0f, 43.31371f, 179.3137f, 46.0f, 176.0f, 46.0f),
                    PathNode.LineTo(80.0f, 46.0f),
                    PathNode.CurveTo(76.686295f, 46.0f, 74.0f, 43.31371f, 74.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 72.0f),
                    PathNode.CurveTo(74.0f, 68.686295f, 76.686295f, 66.0f, 80.0f, 66.0f),
                    PathNode.LineTo(176.0f, 66.0f),
                    PathNode.CurveTo(179.3137f, 66.0f, 182.0f, 68.686295f, 182.0f, 72.0f),
                    PathNode.CurveTo(182.0f, 75.313705f, 179.3137f, 78.0f, 176.0f, 78.0f),
                    PathNode.LineTo(80.0f, 78.0f),
                    PathNode.CurveTo(76.686295f, 78.0f, 74.0f, 75.313705f, 74.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
