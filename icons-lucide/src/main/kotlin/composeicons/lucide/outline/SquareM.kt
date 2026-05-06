package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareM: ImageVector
    get() {
        if (_squareM != null) return _squareM!!
        _squareM = lucideOutlineIcon(
            name = "SquareM",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16v-7.5c0-.215 .138-.406 .342-.474 .204-.068 .429 .002 .558 .174l2.7 3.599c.094 .126 .243 .2 .4 .2 .157 0 .306-.074 .4-.2L15.1 8.199c.129-.172 .354-.242 .558-.174 .204 .068 .342 .259 .342 .474v7.501")
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
        }
        return _squareM!!
    }

private var _squareM: ImageVector? = null
