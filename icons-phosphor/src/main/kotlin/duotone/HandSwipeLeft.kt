package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorDuotoneIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 140.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 200.0f, 200.0f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.LineTo(34.68f, 166.0f),
                    PathNode.CurveTo(29.246195f, 156.4428f, 32.54517f, 144.2916f, 42.066113f, 138.79451f),
                    PathNode.CurveTo(51.58706f, 133.29742f, 63.759884f, 136.51573f, 69.32f, 146.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.LineTo(88.0f, 68.0f),
                    PathNode.CurveTo(88.0f, 56.954304f, 96.95431f, 48.0f, 108.0f, 48.0f),
                    PathNode.CurveTo(119.04569f, 48.0f, 128.0f, 56.954304f, 128.0f, 68.0f),
                    PathNode.LineTo(128.0f, 124.0f),
                    PathNode.CurveTo(128.0f, 112.95431f, 136.9543f, 104.0f, 148.0f, 104.0f),
                    PathNode.CurveTo(159.0457f, 104.0f, 168.0f, 112.95431f, 168.0f, 124.0f),
                    PathNode.LineTo(168.0f, 140.0f),
                    PathNode.CurveTo(168.0f, 128.9543f, 176.9543f, 120.0f, 188.0f, 120.0f),
                    PathNode.CurveTo(199.0457f, 120.0f, 208.0f, 128.9543f, 208.0f, 140.0f),
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
                    PathNode.MoveTo(216.0f, 140.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 201.59f, 207.51f, 218.85f, 207.15f, 219.58f),
                    PathNode.CurveTo(205.7951f, 222.28764f, 203.02771f, 223.99838f, 200.0f, 224.0f),
                    PathNode.CurveTo(198.75978f, 224.00081f, 197.53679f, 223.70964f, 196.43f, 223.15f),
                    PathNode.CurveTo(192.47911f, 221.17496f, 190.87653f, 216.37166f, 192.85f, 212.42f),
                    PathNode.CurveTo(192.91f, 212.3f, 200.01f, 197.61f, 200.01f, 176.0f),
                    PathNode.LineTo(200.01f, 140.0f),
                    PathNode.CurveTo(200.01f, 133.37259f, 194.63742f, 128.0f, 188.01f, 128.0f),
                    PathNode.CurveTo(181.38258f, 128.0f, 176.01f, 133.37259f, 176.01f, 140.0f),
                    PathNode.LineTo(176.01f, 144.0f),
                    PathNode.CurveTo(176.01f, 148.41827f, 172.42828f, 152.0f, 168.01f, 152.0f),
                    PathNode.CurveTo(163.59172f, 152.0f, 160.01f, 148.41827f, 160.01f, 144.0f),
                    PathNode.LineTo(160.01f, 124.0f),
                    PathNode.CurveTo(160.01f, 117.37258f, 154.63742f, 112.0f, 148.01f, 112.0f),
                    PathNode.CurveTo(141.38258f, 112.0f, 136.01f, 117.37258f, 136.01f, 124.0f),
                    PathNode.LineTo(136.01f, 136.0f),
                    PathNode.CurveTo(136.01f, 140.41827f, 132.42828f, 144.0f, 128.01f, 144.0f),
                    PathNode.CurveTo(123.59172f, 144.0f, 120.01f, 140.41827f, 120.01f, 136.0f),
                    PathNode.LineTo(120.01f, 68.0f),
                    PathNode.CurveTo(120.01f, 61.37258f, 114.63742f, 56.0f, 108.01f, 56.0f),
                    PathNode.CurveTo(101.38258f, 56.0f, 96.01f, 61.37258f, 96.01f, 68.0f),
                    PathNode.LineTo(96.01f, 176.0f),
                    PathNode.CurveTo(96.00984f, 179.57092f, 93.64309f, 182.70934f, 90.20983f, 183.69125f),
                    PathNode.CurveTo(86.77657f, 184.67317f, 83.10828f, 183.26082f, 81.22f, 180.23f),
                    PathNode.LineTo(62.54f, 150.23f),
                    PathNode.LineTo(62.4f, 150.0f),
                    PathNode.CurveTo(59.086292f, 144.25624f, 51.743763f, 142.28629f, 46.0f, 145.6f),
                    PathNode.CurveTo(40.256237f, 148.91371f, 38.286293f, 156.25624f, 41.6f, 162.0f),
                    PathNode.LineTo(70.89f, 212.0f),
                    PathNode.CurveTo(72.57025f, 214.4776f, 72.72664f, 217.68597f, 71.29532f, 220.31523f),
                    PathNode.CurveTo(69.864f, 222.94449f, 67.0845f, 224.55463f, 64.09162f, 224.48827f),
                    PathNode.CurveTo(61.098747f, 224.42189f, 58.39336f, 222.69012f, 57.08f, 220.0f),
                    PathNode.LineTo(27.76f, 170.0f),
                    PathNode.CurveTo(19.98107f, 156.63194f, 24.511948f, 139.48894f, 37.88f, 131.71f),
                    PathNode.CurveTo(51.24805f, 123.93107f, 68.39107f, 128.46194f, 76.17f, 141.83f),
                    PathNode.LineTo(80.0f, 148.0f),
                    PathNode.LineTo(80.0f, 68.0f),
                    PathNode.CurveTo(80.0f, 52.53603f, 92.536026f, 40.0f, 108.0f, 40.0f),
                    PathNode.CurveTo(123.463974f, 40.0f, 136.0f, 52.53603f, 136.0f, 68.0f),
                    PathNode.LineTo(136.0f, 98.7f),
                    PathNode.CurveTo(143.28366f, 95.2432f, 151.7039f, 95.093796f, 159.1056f, 98.29003f),
                    PathNode.CurveTo(166.50731f, 101.48626f, 172.17207f, 107.71791f, 174.65f, 115.39f),
                    PathNode.CurveTo(183.32596f, 110.68411f, 193.83868f, 110.89366f, 202.32022f, 115.94156f),
                    PathNode.CurveTo(210.80174f, 120.98945f, 215.9991f, 130.12997f, 216.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 48.0f),
                    PathNode.LineTo(195.31f, 48.0f),
                    PathNode.LineTo(213.65f, 29.66f),
                    PathNode.CurveTo(216.77592f, 26.536827f, 216.77815f, 21.470932f, 213.655f, 18.345f),
                    PathNode.CurveTo(210.53183f, 15.219069f, 205.46593f, 15.21683f, 202.34f, 18.34f),
                    PathNode.LineTo(170.34f, 50.34f),
                    PathNode.CurveTo(168.83777f, 51.840546f, 167.99371f, 53.876724f, 167.99371f, 56.0f),
                    PathNode.CurveTo(167.99371f, 58.123276f, 168.83777f, 60.159454f, 170.34f, 61.66f),
                    PathNode.LineTo(202.34f, 93.66f),
                    PathNode.CurveTo(205.46593f, 96.78317f, 210.53183f, 96.78093f, 213.655f, 93.655f),
                    PathNode.CurveTo(216.77815f, 90.52906f, 216.77592f, 85.46317f, 213.65f, 82.34f),
                    PathNode.LineTo(195.31f, 64.0f),
                    PathNode.LineTo(248.0f, 64.0f),
                    PathNode.CurveTo(252.41827f, 64.0f, 256.0f, 60.418278f, 256.0f, 56.0f),
                    PathNode.CurveTo(256.0f, 51.581722f, 252.41827f, 48.0f, 248.0f, 48.0f),
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
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
