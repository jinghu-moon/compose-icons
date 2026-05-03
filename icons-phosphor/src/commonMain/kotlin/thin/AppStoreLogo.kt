package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorThinIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.9f, 194.0f),
                    PathNode.LineTo(51.44f, 210.0f),
                    PathNode.CurveTo(50.811188f, 211.39134f, 49.445156f, 212.30336f, 47.91905f, 212.35072f),
                    PathNode.CurveTo(46.392937f, 212.39809f, 44.97298f, 211.57253f, 44.259106f, 210.22285f),
                    PathNode.CurveTo(43.545227f, 208.87317f, 43.66197f, 207.23482f, 44.56f, 206.0f),
                    PathNode.LineTo(54.0f, 190.0f),
                    PathNode.CurveTo(55.185036f, 188.28082f, 57.493073f, 187.76236f, 59.29952f, 188.80959f),
                    PathNode.CurveTo(61.105965f, 189.8568f, 61.803005f, 192.11732f, 60.9f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 156.0f),
                    PathNode.LineTo(181.92f, 156.0f),
                    PathNode.LineTo(150.0f, 102.0f),
                    PathNode.CurveTo(148.8761f, 100.09738f, 146.42262f, 99.4661f, 144.52f, 100.59f),
                    PathNode.CurveTo(142.61739f, 101.7139f, 141.9861f, 104.16738f, 143.11f, 106.07f),
                    PathNode.LineTo(204.56f, 210.0f),
                    PathNode.CurveTo(205.25623f, 211.29118f, 206.60335f, 212.09769f, 208.07028f, 212.10155f),
                    PathNode.CurveTo(209.5372f, 212.1054f, 210.88855f, 211.30598f, 211.59155f, 210.01846f),
                    PathNode.CurveTo(212.29454f, 208.73096f, 212.23639f, 207.16193f, 211.44f, 205.93f),
                    PathNode.LineTo(186.65f, 163.93f),
                    PathNode.LineTo(232.0f, 163.93f),
                    PathNode.CurveTo(234.20914f, 163.93f, 236.0f, 162.13914f, 236.0f, 159.93f),
                    PathNode.CurveTo(236.0f, 157.72084f, 234.20914f, 155.93f, 232.0f, 155.93f),
                    PathNode.Close,
                    PathNode.MoveTo(142.47f, 156.0f),
                    PathNode.LineTo(83.37f, 156.0f),
                    PathNode.LineTo(155.44f, 34.0f),
                    PathNode.CurveTo(156.33803f, 32.765175f, 156.45477f, 31.126827f, 155.74089f, 29.777147f),
                    PathNode.CurveTo(155.02702f, 28.427467f, 153.60706f, 27.601912f, 152.08095f, 27.649273f),
                    PathNode.CurveTo(150.55486f, 27.696634f, 149.18881f, 28.608652f, 148.56f, 30.0f),
                    PathNode.LineTo(128.0f, 64.75f),
                    PathNode.LineTo(107.44f, 30.0f),
                    PathNode.CurveTo(106.81119f, 28.608652f, 105.44516f, 27.696634f, 103.919044f, 27.649273f),
                    PathNode.CurveTo(102.39294f, 27.601912f, 100.972984f, 28.427467f, 100.2591f, 29.777147f),
                    PathNode.CurveTo(99.54523f, 31.126827f, 99.661964f, 32.765175f, 100.56f, 34.0f),
                    PathNode.LineTo(123.35f, 72.58f),
                    PathNode.LineTo(74.08f, 156.0f),
                    PathNode.LineTo(24.0f, 156.0f),
                    PathNode.CurveTo(21.790861f, 156.0f, 20.0f, 157.79086f, 20.0f, 160.0f),
                    PathNode.CurveTo(20.0f, 162.20914f, 21.790861f, 164.0f, 24.0f, 164.0f),
                    PathNode.LineTo(142.47f, 164.0f),
                    PathNode.CurveTo(144.67914f, 164.0f, 146.47f, 162.20914f, 146.47f, 160.0f),
                    PathNode.CurveTo(146.47f, 157.79086f, 144.67914f, 156.0f, 142.47f, 156.0f),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
