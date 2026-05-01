package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorDuotoneIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.LineTo(128.0f, 201.45f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 184.0f),
                    PathNode.LineTo(96.0f, 195.64f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 54.55f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.LineTo(96.0f, 60.36f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 139.58173f, 120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 201.45f),
                    PathNode.CurveTo(119.99572f, 205.32004f, 122.76228f, 208.63823f, 126.57f, 209.33f),
                    PathNode.LineTo(206.57f, 223.87f),
                    PathNode.CurveTo(207.0415f, 223.95831f, 207.5203f, 224.00183f, 208.0f, 224.0f),
                    PathNode.CurveTo(212.41827f, 224.0f, 216.0f, 220.41827f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 139.58173f, 212.41827f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 206.41f),
                    PathNode.LineTo(136.0f, 194.78f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(27.581722f, 136.0f, 24.0f, 139.58173f, 24.0f, 144.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(24.000559f, 187.86627f, 26.765999f, 191.17891f, 30.57f, 191.87f),
                    PathNode.LineTo(94.57f, 203.51f),
                    PathNode.CurveTo(95.042175f, 203.5934f, 95.52053f, 203.63689f, 96.0f, 203.64f),
                    PathNode.CurveTo(100.41828f, 203.64f, 104.0f, 200.05827f, 104.0f, 195.64f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(104.0f, 139.58173f, 100.41828f, 136.0f, 96.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 186.05f),
                    PathNode.LineTo(40.0f, 177.32f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.13f, 33.86f),
                    PathNode.CurveTo(211.30821f, 32.338795f, 208.90503f, 31.705029f, 206.57f, 32.13f),
                    PathNode.LineTo(126.57f, 46.68f),
                    PathNode.CurveTo(122.766f, 47.371094f, 120.00056f, 50.68373f, 120.0f, 54.55f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.CurveTo(120.0f, 116.41828f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 116.41828f, 216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0004f, 37.629177f, 214.9492f, 35.38029f, 213.13f, 33.86f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 61.22f),
                    PathNode.LineTo(200.0f, 49.59f),
                    PathNode.Close,
                    PathNode.MoveTo(101.13f, 54.22f),
                    PathNode.CurveTo(99.30821f, 52.698795f, 96.90503f, 52.06503f, 94.57f, 52.49f),
                    PathNode.LineTo(30.57f, 64.13f),
                    PathNode.CurveTo(26.765999f, 64.8211f, 24.000559f, 68.13373f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 112.0f),
                    PathNode.CurveTo(24.0f, 116.41828f, 27.581722f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(100.41828f, 120.0f, 104.0f, 116.41828f, 104.0f, 112.0f),
                    PathNode.LineTo(104.0f, 60.36f),
                    PathNode.CurveTo(104.0004f, 57.989174f, 102.94921f, 55.74029f, 101.13f, 54.22f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.LineTo(40.0f, 78.68f),
                    PathNode.LineTo(88.0f, 70.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
