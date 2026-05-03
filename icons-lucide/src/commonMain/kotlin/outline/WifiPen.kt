package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WifiPen: ImageVector
    get() {
        if (_wifiPen != null) return _wifiPen!!
        _wifiPen = lucideOutlineIcon(
            name = "WifiPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 8.82f),
                    PathNode.CurveTo(7.694013f, 3.72712f, 16.305986f, 3.72712f, 22.0f, 8.82f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.378f, 16.626f),
                    PathNode.CurveTo(22.20753f, 15.796469f, 22.20753f, 14.451531f, 21.378f, 13.622f),
                    PathNode.CurveTo(20.548468f, 12.792468f, 19.203531f, 12.792468f, 18.374f, 13.622f),
                    PathNode.LineTo(14.364f, 17.634f),
                    PathNode.CurveTo(14.126247f, 17.871622f, 13.952221f, 18.165335f, 13.858f, 18.488f),
                    PathNode.LineTo(13.021f, 21.358f),
                    PathNode.CurveTo(12.969881f, 21.533264f, 13.018352f, 21.722458f, 13.147447f, 21.851551f),
                    PathNode.CurveTo(13.276542f, 21.980648f, 13.465735f, 22.02912f, 13.641f, 21.978f),
                    PathNode.LineTo(16.511f, 21.141f),
                    PathNode.CurveTo(16.833666f, 21.04678f, 17.127378f, 20.872753f, 17.365f, 20.635f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 12.859f),
                    PathNode.CurveTo(7.772405f, 10.143786f, 11.865338f, 9.277643f, 15.5f, 10.637f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.5f, 16.429f),
                    PathNode.CurveTo(9.311152f, 15.633012f, 10.369272f, 15.137106f, 11.5f, 15.023f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiPen!!
    }

private var _wifiPen: ImageVector? = null
