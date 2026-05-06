package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorBoldIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.29 131.34 176.17 80.19C169.659 72.791 160.399 68.385 150.55 68c11.907-9.568 16.479-25.608 11.408-40.016C156.886 13.577 143.274 3.938 128 3.938c-15.274 0-28.886 9.639-33.958 24.047C88.971 42.392 93.543 58.432 105.45 68c-9.849 .385-19.109 4.791-25.62 12.19L34.71 131.34c-9.043 9.373-8.96 24.247 .187 33.519 9.147 9.272 24.019 9.556 33.513 .641l6.73-5.39L61.74 211c-4.863 11.96 .607 25.625 12.381 30.925 11.773 5.3 25.63 .336 31.359-11.235L128 191.9l22.52 38.79c2.727 5.516 7.482 9.762 13.27 11.85 8.908 3.246 18.891 .944 25.478-5.874 6.587-6.818 8.543-16.876 4.992-25.666L180.86 160.11l6.73 5.39c9.495 8.915 24.367 8.631 33.513-.641 9.147-9.272 9.23-24.146 .187-33.519ZM128 28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM203 147.12 167.48 118.63c-4.04-3.239-9.703-3.521-14.045-.699-4.342 2.822-6.384 8.111-5.065 13.119L171.27 218c.184 .687 .429 1.356 .73 2-.149-.342-.316-.676-.5-1L138.38 162c-2.147-3.701-6.102-5.979-10.38-5.979-4.278 0-8.233 2.278-10.38 5.979L84.5 219c-.184 .324-.351 .658-.5 1 .297-.646 .541-1.315 .73-2l22.87-86.92c1.319-5.008-.723-10.297-5.065-13.119-4.342-2.822-10.005-2.54-14.045 .699L53 147.12c-.35 .271-.684 .561-1 .87 .18-.17 .35-.36 .52-.54L97.83 96.06c2.278-2.582 5.556-4.061 9-4.06h42.34c3.444-.001 6.721 1.478 9 4.06l45.32 51.39c.17 .18 .34 .37 .52 .54-.32-.309-.657-.6-1.01-.87Z"),
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
        return _person!!
    }

private var _person: ImageVector? = null
