package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Rocket2Line: ImageVector
    get() {
        if (_rocket2Line != null) return _rocket2Line!!
        _rocket2Line = remixIcon(
            name = "Rocket2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.502 20.005c-.659 1.579-1.922 2.843-3.502 3.502C10.421 22.848 9.157 21.584 8.498 20.005h2.259c.326 .489 .748 .912 1.243 1.243 .495-.331 .916-.755 1.243-1.243h2.259ZM18 14.809l2 2.268v1.927h-16v-1.927L6 14.809v-5.805C6 5.522 8.504 2.558 12 1.46c3.496 1.098 6 4.062 6 7.545v5.805ZM17.269 17.005 16 15.565v-6.561C16 6.687 14.429 4.574 12 3.584 9.571 4.574 8 6.687 8 9.005v6.561L6.731 17.005h10.538ZM12 11.005c-1.105 0-2-.896-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _rocket2Line!!
    }

private var _rocket2Line: ImageVector? = null
