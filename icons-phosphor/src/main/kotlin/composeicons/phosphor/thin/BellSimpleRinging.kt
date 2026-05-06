package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorThinIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 224c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM223.84 62.16C215.175 45.215 202.16 30.879 186.13 20.62c-1.209-.847-2.786-.96-4.103-.294-1.317 .666-2.16 2.004-2.193 3.48-.033 1.476 .749 2.85 2.035 3.574 14.825 9.505 26.858 22.778 34.87 38.46 .687 1.326 2.056 2.159 3.55 2.16 .641 .002 1.272-.153 1.84-.45 1.96-1.017 2.725-3.429 1.71-5.39ZM39.26 65.84C47.272 50.158 59.305 36.885 74.13 27.38c1.746-1.224 2.225-3.603 1.088-5.408C74.081 20.168 71.728 19.573 69.87 20.62 53.84 30.879 40.825 45.215 32.16 62.16c-1.015 1.961-.25 4.373 1.71 5.39 .568 .297 1.199 .452 1.84 .45 1.494-.001 2.863-.834 3.55-2.16ZM218.36 178c2.141 3.708 2.144 8.275 .008 11.986-2.136 3.711-6.087 6.002-10.368 6.014h-160c-4.281-.012-8.232-2.303-10.368-6.014-2.136-3.711-2.133-8.278 .008-11.986C47.17 161.56 52 139.37 52 112 52 70.026 86.026 36 128 36c41.974 0 76 34.026 76 76 0 27.36 4.83 49.55 14.36 66ZM211.44 182C201.19 164.34 196 140.79 196 112 196 74.445 165.555 44 128 44 90.445 44 60 74.445 60 112c0 28.8-5.19 52.34-15.44 70-.715 1.238-.715 2.762 0 4 .693 1.247 2.013 2.015 3.44 2h160c1.423 .011 2.739-.756 3.43-2 .718-1.236 .721-2.761 .01-4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
