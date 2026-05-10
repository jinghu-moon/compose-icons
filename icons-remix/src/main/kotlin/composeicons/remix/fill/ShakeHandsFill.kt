package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShakeHandsFill: ImageVector
    get() {
        if (_shakeHandsFill != null) return _shakeHandsFill!!
        _shakeHandsFill = remixIcon(
            name = "ShakeHandsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.291 6h.709c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-2L13.832 9.164c-.497-.696-1.383-.999-2.202-.753L9.144 9.157C8.44 9.368 7.676 9.176 7.156 8.655L6.863 8.362C6.417 7.916 6.49 7.173 7.015 6.823L12.416 3.223c.659-.439 1.515-.448 2.183-.023l4.155 2.644c.16 .102 .347 .156 .537 .156ZM5.027 14.295 3.411 15.708c-.471 .412-.452 1.152 .041 1.539l5.141 4.039c.48 .377 1.183 .24 1.486-.29l.704-1.232c.43-.753 .326-1.696-.257-2.338L7.824 14.455c-.733-.806-1.977-.877-2.797-.16ZM7.046 5h-4.046C2.448 5 2 5.448 2 6v7.516c0 .408 .125 .801 .35 1.131 .024-.023 .048-.045 .073-.067L4.039 13.166c1.435-1.256 3.612-1.132 4.895 .28l2.702 2.972c1.02 1.122 1.201 2.774 .449 4.091l-.654 1.145c.563 .213 1.204 .165 1.738-.155l4.409-2.646c.5-.3 .638-.963 .299-1.438L12.611 10.036c-.124-.174-.346-.25-.551-.188l-2.485 .746c-1.233 .37-2.57 .033-3.481-.877L5.802 9.423C4.686 8.308 4.87 6.45 6.183 5.575L7.046 5Z"),
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
        return _shakeHandsFill!!
    }

private var _shakeHandsFill: ImageVector? = null
